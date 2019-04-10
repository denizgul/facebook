

import java.util.ArrayList;

/**
 * N light bulbs are connected by a wire. Each bulb has a switch associated with it, however due to faulty wiring, a switch also changes the state of all the bulbs to the right of current bulb. Given an initial state of all bulbs, find the minimum number of switches you have to press to turn on all the bulbs. You can press the same switch multiple times.

Note : 0 represents the bulb is off and 1 represents the bulb is on.

Example:

Input : [0 1 0 1]
Return : 4

Explanation :
	press switch 0 : [1 0 1 0]
	press switch 1 : [1 1 0 1]
	press switch 2 : [1 1 1 0]
	press switch 3 : [1 1 1 1]
 * @author deniz.gul
 *
 */
public class Bulbs {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		a.add(0);
		a.add(1);
		a.add(0);
		a.add(1);
		
		System.out.println(bulbs(a));

	}

	//O(n2) solution
	 public static int bulbs(ArrayList<Integer> a) {
	        
	        int counter=0;
	        for(int i=0; i<a.size(); i++){
	           int current = a.get(i);
	           
	           //tek ise tersini degerlendir.
	           if(counter%2==1) {
	        	   current=1-current;
	           }
	           if(current == 0){
	               a.set(i,1);
	               counter++;
	           }
	           
	        }
	        return counter;
	    }
}
