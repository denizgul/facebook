import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//reverse a string
public class ReverseString {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String line = reader.readLine();
		
		System.out.println(reverseStringSwap(line));

	}
	
	//O(n)
	public static String reverseString(String toReverse){
		char[] charArr = toReverse.toCharArray();

		int length = toReverse.length();
		char[] reversed = new char[length];

		int j=0;
		for(int i=length-1; i>=0 ; i--) {
			reversed[j]=charArr[i];
			j++;
		}	

		return new String(reversed);
		 
	}
	
	public static String reverseStringSwap(String toReverse) {
		char[] charArr = toReverse.toCharArray();

		int length = toReverse.length();
		int last = length-1;
		
		for(int i=0; i<=length/2 ; i++) {
			char ch = charArr[i];
			charArr[i] = charArr[last-i];
			charArr[last-i]=ch;
		}	
		
		return new String(charArr);
		
	}

}
