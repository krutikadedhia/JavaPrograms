import java.io.File;
import java.util.Scanner;

	public class ConvertCSVtoXML {     

	    public static void main(String[] args) {

	        String startFile = "C:\\Users\\kruti\\workspace\\Practice\\src\\testfile.csv";
	        String outFile = "./outData.xml";
	        File file = new File(startFile);
	        try {
	            Scanner inputStream = new Scanner(file);
	            
	            while(inputStream.hasNext()){
	            	String data = inputStream.next();
		            System.out.println(data);
	            }
	        } catch (Exception e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	    }
}
