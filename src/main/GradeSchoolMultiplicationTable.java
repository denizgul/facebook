
public class GradeSchoolMultiplicationTable {
	
	public static void main(String args[]) {
		printMultiplicationTable(12);
	}
	public static void printMultiplicationTable(int max){
		for(int i=1; i <= max; i++){
			for(int j=1;j<= max; j++){
				System.out.print(String.format("%4d", i * j) );
			}
			System.out.println();
		}
	}

}
