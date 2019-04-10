import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FibonacciNumber {
	//Example 2:  Write function to compute Nth fibonacci number:
	
	//1 1 2 3 5 8
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(reader.readLine());
		
		System.out.println(fibonacci(n));

	}
	
	public static int fibonacci(int n) {
		if(n==0 || n==1) {
			return 1;
		}

		return fibonacci(n-1) + fibonacci(n-2);
	}

}
