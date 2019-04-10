import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFromFile {

	public static void main (String args[]) throws NumberFormatException, IOException {

	}
	
	public static void readFile(String name) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(name));
			int sum=0;
			while(reader.readLine() != null) {
				sum += Integer.parseInt(reader.readLine());
			}
			
			System.out.println(sum);
			reader.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void readFileWithFor(String name) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(name));
			int sum=0;
			for(String s = reader.readLine(); s != null;s = reader.readLine() ) {	
				sum += Integer.parseInt(reader.readLine());
			}
			
			System.out.println(sum);
			reader.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
