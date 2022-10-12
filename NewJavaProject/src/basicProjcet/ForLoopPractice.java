package basicProjcet;

public class ForLoopPractice {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		
		for (int i = 0 ; i <= 10 ; i++) {
			
			System.out.println(i  + " first loop");
			
		}
		
		for (int c = 0 ; c<= b; c++) {
			
			if (c % 2 == 1 ) {
				
				System.out.println(c);
			}
			
		}

	}

}