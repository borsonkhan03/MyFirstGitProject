package basicProjcet;

public class BasicProject {

	int a = 10;
	int b = 20;
	int c = 40;

	public static void main(String[] args) {

		BasicProject bs = new BasicProject();
		bs.substraction();
		bs.adding();

	}

	// please print value of B -A & C-B and print in console ;
	public void substraction() {

		int substarctionText = b - a;
		System.out.println("substraction text = " + substarctionText);

		int substaractionTwo = c - substarctionText;
		System.out.println(substaractionTwo);
	}

	// write a method that adding a * b * && b* c ;
	public void adding() {

		int multiply = a * b;
		System.out.println(multiply);

		int multiplyC = b * c;
		System.out.println(multiplyC);
	}
	//write a method that multiply by two number and adding up to 89 and print it
	public void multiply() {
		
	}


}
