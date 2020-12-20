package test;

import selenium.Test4;////////// This is hovered and imported

public class Test1 {
	
	// ClassName obName = new ClassName();
	static Test1 t1 = new Test1();                 // these are objects being created
	static Test2 t2 = new Test2();
	static Test3 t3 = new Test3();
	static Test4 t4 = new Test4();
	
	

	public static void main(String[] args) {
		
		System.out.println("I am in Main Method");
		printMe();                                 //static so called directly (no need to create object)
		System.out.println("after PrintMe");
		scanMe();                                  //static
		t1.testMe();  //non static in same class
		t1.pingMe();
		Test2.cleanMe(); //static in different class
		t2.hitMe();  //non static in different class
		Test3.hello();
		t3.world();
		Test4.testing1();
		t4.testing2();
		

	}
	public static void printMe() {
		System.out.println("printMe");
	}
	public static void scanMe() {
		System.out.println("scanMe");
	}
	public void testMe() {
		System.out.println("testMe");
	}
	public void pingMe() {
		System.out.println("pingMe");
	}

}
