
public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPrime4(25));
	}
	
	//trivial case
	public static boolean isPrime(int number) {
		if(number==1) return false;
		
		for(int i=2;i<number/2;i++) {
			if(number%i==0) {
				return false;
			}
		}
		return true;
	}
	
	//much faster case
	public static boolean isPrime2(int number) {
		if(number==1) return false;
		
		for(int i = 2 ; i*2 < number ; i++) {
			if(number % i == 0) {
				
				return false;
			}
		}
		return true;
	}
	
	//much much faster case
	//bu yanlıs. 25 icin asal sayı diyor
	public static boolean isPrime3(int number) {
		if (number == 2)  return true;
		if (number %2 == 0) return false;
		
		for(int i = 3 ; i*i < number ; i++) {
			if(number % i == 0) {
				
				return false;
			}
		}
		return true;
	}
	
	public static boolean isPrime4(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
	

}
