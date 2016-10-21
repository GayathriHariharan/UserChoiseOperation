import java.util.*;

public class GetUserChoice {

	static Scanner scan = new Scanner(System.in);
	static int mainChoice;

	public static void main(String args[]) {

		getMainChoice();

	}

	static void displayMainMenu() {

		System.out.println("1.String Operation");
		System.out.println("2.Numerical Operation");
		System.out.println("3.Exit");
		System.out.println("Please enter your choice");

	}

	static void getMainChoice() {

		do {
			try {
				displayMainMenu();
				mainChoice = scan.nextInt();
				mainSwitchMethod(mainChoice);
			} catch (InputMismatchException ime) {
				System.out.println("Please enter valid choice");
				mainChoice = 0;
				scan.next();

			}
		} while (mainChoice != 3);
	}

	static void mainSwitchMethod(int mainChoice) {
		switch (mainChoice) {
		case 1:
			StringOperation so = new StringOperation();
			so.getChoice();
			break;
		case 2:
			NumericOperation no = new NumericOperation();
			no.getChoice();
			break;
		case 3:
			System.exit(0);
		default:
			System.out.println("Please enter valid choice");
			getMainChoice();

		}
	}

}
