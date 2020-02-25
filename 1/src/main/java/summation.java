public class summation {
	public static void main(String[] args) {
		int input=10;
		int finalResult=summation(input);
		System.out.println(finalResult);
		
	}
	
	public static int summation(int n) {
		int result=(n*(n+1))/2;
		return result;
	}

}
