
public class GCD {

	public static void main(String[] args) {
		System.out.println(gcd(2,0));
	}

	
	public static int gcd(int a, int b) {
	    
	    int small = a > b? b:a;
	    
	    if(small==0) return a>b?a:b;
	    
	    int divisor=1;
	    for(int i=small; i>0;i--) {
	        if(a % i ==0 && b % i==0 && i > divisor){
	            divisor=i;
	        }
	    }
	    return divisor;
	}

}
