import java.util.PriorityQueue;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,8,4,3,2};
		System.out.println(solution(arr,7,11,3));
		
		PriorityQueue<String> pQueue = 
                new PriorityQueue<String>(); 
	}
	
	
	private static int m(const vector<int> &a, int k) {
	    int t = 0, i = 0, n = a.size();
	    priority_queue<int, vector<int>, greater<int>> q;
	    while (i < n) {
	        if (q.size() < k) {
	            if (i == n-1) return t;
	            q.push(a[i++] + t);
	        }
	        else {
	            t = q.top();
	            q.pop();
	        }
	    }
	    return -1;
	}
	
	
	private static int solution(int[] A, int X, int Y, int Z) {
        int waitingCount=0;
        int[] dispenserArr = {X,Y,Z};
        int[] waitingArray = {0,0,0};
        
        for(int i = 0; i < A.length ; i++) {
        	int demand = A[i];
        	for(int j = 0; j < dispenserArr.length;j++) {
        		int dispenser = dispenserArr[j];
        		
        		if(waitingArray[j]==0) {
        			if(dispenser >= demand) {
        				waitingArray[j] = demand;
            			dispenserArr[j] -= demand;
            			break;
        			}
        		}
        		
        	}
        	
        }
        
        
        return waitingCount;
    }
	
//	private static int solution(int N) {
//		
//		String num = String.valueOf(N);
//		char[] chararr = num.toCharArray();
//		Arrays.sort(chararr);
//		String number="";
//		for(int i=chararr.length-1; i>=0;i--) {
//			number+=chararr[i];
//		}
//		
//		return Integer.valueOf(number.toString());
//	}
	
//	 private static int solution(int n) {
//	        int[] d = new int[30];
//	        int l = 0;
//	        int p;
//	        while (n > 0) {
//	            d[l] = n % 2;
//	            n /= 2;
//	            l++;
//	        }
//	        for(int i = 0; i < d.length; i++) {
//	        	System.out.print(d[i]);
//	        }
//	        System.out.println();
//	        
//	        for (p = l/2; p > 0; p--) {
//	            int i;
//	            boolean ok = true;
//	            for (i = 0; i < l - p; i++) {
//	                if (d[i] != d[i + p]) {
//	                    ok = false;
//	                    break;
//	                }
//	            }
//	            if (ok) {
//	                return p;
//	            }
//	        }
//	        return -1;
//	    }
	
}
