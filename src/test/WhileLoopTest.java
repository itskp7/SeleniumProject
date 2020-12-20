package test;

public class WhileLoopTest {

	public static void main(String[] args) {
		
		int i=1;
		while(i<11) {
			System.out.println(i);
			i=i+1;                //i=i+1 is equal to i++
			if (i==5){
				System.out.println("we got 5");
				break;
			
			}
		}
	

	}

}
