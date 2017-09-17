import java.util.Scanner;

public class CSVtoXML {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XMLCreators xmlCreator = new XMLCreators();
		//Take input from user if csv file has headers
	      Scanner scan = new Scanner(System.in);
	      System.out.println("Does the file contain headers - yes or no?");
	      String header = scan.nextLine();
		int output = xmlCreator.convertFile(".\\src\\testfile.csv", ".\\src\\output.xml", ",",header);
		System.out.println("XML Document has been created with "+output+" rows");
	}

}
