public class summation {
	public static void main(test1[] args) {
		int input=10;
		int finalResult=summation(input);
		System.out.println(finalResult);
		
	}
	
	public static int summation(int n) {
		int result=(n*(n+1))/2;
		return result;
	}

}
