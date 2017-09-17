import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.FactoryConfigurationError;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class XMLCreators {
	// Protected Properties
	  protected DocumentBuilderFactory domFactory = null;
	  protected DocumentBuilder domBuilder = null;

	  public XMLCreators() {
	    try {
	      domFactory = DocumentBuilderFactory.newInstance();
	      domBuilder = domFactory.newDocumentBuilder();
	    } catch (FactoryConfigurationError exp) {
	      System.err.println(exp.toString());
	    } catch (ParserConfigurationException exp) {
	      System.err.println(exp.toString());
	    } catch (Exception exp) {
	      System.err.println(exp.toString());
	    }

	  }

	  public int convertFile(String csvFileName, String xmlFileName, String delimiter, String header) {

	    int rowsCount = -1;
	    try {
	      //Create new XML document
	      Document newDoc = domBuilder.newDocument();
	      
	      //Create the Root element
	      Element rootElement = newDoc.createElement("XML");
	      newDoc.appendChild(rootElement);
	      
	      // Using BufferedReader to Read csv file
	      BufferedReader csvReader;
	      csvReader = new BufferedReader(new FileReader(csvFileName));
	      int fieldCount = 0;
	      String[] csvFields = null;
	      StringTokenizer stringTokenizer = null;
	      
	      //Assuming the first line as column headers
	      String curLine = csvReader.readLine();
	      if (curLine != null) {
	        stringTokenizer = new StringTokenizer(curLine, delimiter);
	        fieldCount = stringTokenizer.countTokens();
	        if (fieldCount > 0) {
	          csvFields = new String[fieldCount];
	          int i = 0;
	          while (stringTokenizer.hasMoreElements()){
	        	  if(header.equalsIgnoreCase("yes")){
	            csvFields[i] = String.valueOf(stringTokenizer.nextElement());
	        	  }
	        	  else{
	        	String dummy = String.valueOf(stringTokenizer.nextElement()); // to move the pointer to next token
	        	csvFields[i] = "Column"+i;   
	        	  }
	            i++;
	          }
	        }
	      }
	      
	      if(header.equalsIgnoreCase("no")){
		      csvReader = new BufferedReader(new FileReader(csvFileName)); // reading the file again from start 
	      }
	      
	      // Reading data by line by line after the header row
	      while ((curLine = csvReader.readLine()) != null) 	 {   	  
	    	  String tokens[] = curLine.split(",",fieldCount+1); //limit parameter will be applied fieldCount times and retain empty string
	        if (fieldCount > 0) {
	          Element rowElement = newDoc.createElement("row"); //creating a new row
	          int i = 0;
	          while (i<fieldCount) {
	            try {
	              String curValue = String.valueOf(tokens[i]);
	              Element curElement = newDoc.createElement(csvFields[i]); //creating a new element tag 
	              curElement.appendChild(newDoc.createTextNode(curValue)); //inserting the value inside the tag
	              rowElement.appendChild(curElement);
	              i++;
	            } catch (Exception exp) {
	            }
	          }
	          rootElement.appendChild(rowElement);
	          rowsCount++;
	        }
	      }	
	      csvReader.close();

	      // For saving the XML output document to the disk file
	      TransformerFactory tranFactory = TransformerFactory.newInstance();
	      Transformer aTransformer = tranFactory.newTransformer();
	      
	      //for XML formatting
	      aTransformer.setOutputProperty(OutputKeys.INDENT, "yes");
	      aTransformer.setOutputProperty(OutputKeys.METHOD, "xml");
	      aTransformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
	      
	      Source src = new DOMSource(newDoc);
	      Result result = new StreamResult(new File(xmlFileName));
	      aTransformer.transform(src, result);
	      rowsCount++;

	    } catch (IOException exp) {
	      System.err.println(exp.toString());
	    } catch (Exception exp) {
	      System.err.println(exp.toString());
	    }
	    //return the number of rows
	    return rowsCount;

	  }
}
