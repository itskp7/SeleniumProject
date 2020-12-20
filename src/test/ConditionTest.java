package test;

public class ConditionTest {

	public static void main(String[] args) {
		int a=7;
		int b=6;
		
		if(a>b) {
			System.out.println("a is greater than b");
		}
		else {
			System.out.println("b is greater than a");
		}
		String p ="Selenium";
		String q ="selenium";
		if(p.equals(q)) {
			System.out.println("equals");
		}
		else {
			System.out.println("not equals");
		}
		if (p.equalsIgnoreCase(q)) {
			System.out.println("equals");
		}
		else {
			System.out.println("not equals");
			
		}

	}

}
