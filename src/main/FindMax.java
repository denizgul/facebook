public class FindMax {
	public static void main (String args[]) {
		int[] arr= {1,3,7,2,9,13,10}; 
		System.out.println(findMax(arr));
	}
	
	public static int findMax(int[] arr) {
	 	int max=0;

	 	for(int i=0; i < arr.length ; i++) {
	 		
	 		if(arr[i] > max) {
	 			max=arr[i];
	 		}
	 	}
	 	return max;
	 }
}
