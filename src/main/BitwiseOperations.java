/**
 * Write a function that takes an unsigned integer and returns the number of 1 bits it has.

Example:

The 32-bit integer 11 has binary representation

00000000000000000000000000001011
so the function should return 3.

Note that since Java does not have unsigned int, use long for Java
 * @author deniz.gul
 *
 */
public class BitwiseOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long number = 01111101000;
		
		System.out.println(countOnes(number));
	}
	
	public static int countOnes(long number) {
		int count=0;
		
		while(number != 0) {
			if((number & 1) == 1) {
				count++;
			}
			number = number >> 1;
		}
		return count;
	}

}
