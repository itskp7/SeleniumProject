package test;

public class ReturnTypeTest {

	public static void main(String[] args) {
		
		int i = sum();
		System.out.println(i);
		System.out.println(sum());
		int j =sum(5,5);
		System.out.println(j);
		String k =hi();
		System.out.println(k);
	
	}
	
	public static int sum() {
		int a =5+4;
		return a;
	}
	
	public static int sum (int b, int c) {
		int d = b+c;
		return d;
	}
	
	public static String hi() {
		String myName = "Krunal";
		return myName;
		

	}

}
