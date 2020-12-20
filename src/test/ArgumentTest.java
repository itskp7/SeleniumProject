package test;

public class ArgumentTest {

	public static void main(String[] args) {
		sum();
		sum(6,7);
		sum(10,11);
		sum(1,2,3);
		sum(10,11,12);

	}
	public static void sum() {
		int a=5+4;
		System.out.println(a);
	}
	/*public static void sum() { //its called overloading
		int a=6+6;
		System.out.println(a);
	}*/
	
	public static void sum(int b, int c) {//generic method bcz if we want to call in other class then this is better bcz (SEE UP COMMENT)
		int d = b+c;
		System.out.println(d);
	
	}
	public static void sum(int p, int  q, int r) {
		int t = p+q+r;
		System.out.println(t);	
	}
	
	}

