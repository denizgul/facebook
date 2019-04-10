/**
 * Given N and M find all stepping numbers in range N to M

The stepping number:

A number is called as a stepping number if the adjacent digits have a difference of 1.
e.g 123 is stepping number, but 358 is not a stepping number

Example:

N = 10, M = 20
all stepping numbers are 10 , 12 
Return the numbers in sorted order.
 */

import java.util.ArrayList;
import java.util.Collections;

public class Adjacent {

	
	public static void main(String[] args) {
		
		System.out.println(stepnum(10,20));
	}
	
	public static ArrayList<Integer> stepnum(int a, int b) {
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=a; i<=b; i++) {
			if(isSteppingNumber(i)) {
				list.add(i);
			}
		}
		Collections.sort(list);
		return list;
	}
	
	public static boolean isSteppingNumber(int number) {
		String num = String.valueOf(number);
		char[] chararr = num.toCharArray();
		
		boolean steppingnumber=true;
		for(int i=0;i<chararr.length; i++) {
			int x = Integer.valueOf(chararr[i]);
			if(i+1 != chararr.length) {
				int y = Integer.valueOf(chararr[i+1]);
				
				if(Math.abs(x-y) != 1) {
					steppingnumber=false;
				}
			}
		}
		return steppingnumber;
	}
}
