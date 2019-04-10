
/**
 * Given a positive integer which fits in a 32 bit signed integer, find if it can be expressed as A^P where P > 1 and A > 0. A and P both should be integers.

	Example

	Input : 4
	Output : True  
	as 2^2 = 4. 
 * @author deniz.gul
 *
 */
public class Power2 {
	public static void main(String[] args) {
		System.out.println(isPower(9));
		
	}
	
	public static boolean isPower(int number) {
		int p=1;
		int a=2;
		if(number==1) return true;
		while(Math.pow(a, p) < number) {
			while(Math.pow(a, p) <= number) {
				if(Math.pow(a, p) == number) {
					return true;
				}
				p++;	
			}
			a++;
			p=1;
		}
		return false;
	}
	
}
