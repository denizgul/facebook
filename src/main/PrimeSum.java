

import java.util.ArrayList;
import java.util.Collections;

public class PrimeSum {

	public static void main(String[] args) {
		primesum(28);

	}
	public static ArrayList<Integer> primesum(int a) {
		ArrayList<Integer> returnList = new ArrayList<>();
		
		
		for(int i=2; i<a ; i++) {
			if(isPrime(i) && isPrime(a-i)) {
				returnList.add(i);
				returnList.add(a-i);
				return returnList;
			}
		}
		
		return returnList;
		
		 
    }
	
	
	public static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
