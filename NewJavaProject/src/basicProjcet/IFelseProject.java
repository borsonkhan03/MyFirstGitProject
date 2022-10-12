package basicProjcet;

public class IFelseProject {

	public static void main(String[] args) {
		int age = 105;
		if (age >= 18 && age < 30) {
			System.out.println("you are teenage voter");
		} else if (age >= 30 && age < 50) {
			System.out.println("you are young voter ");
		} else if (age >= 50 && age < 70) {
			System.out.println("you are middleage voter");
		} else if (age >= 70 && age < 90) {
			System.out.println("you are old age voter");
		} else if (age >= 90 && age < 100) {
			System.out.println("you dont need to come for voting");

		} else {
			System.out.println("System error");
		}

	}

}
