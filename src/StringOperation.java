import java.io.BufferedReader;
import java.io.*;
import java.util.*;

public class StringOperation {
	int choice;
	int stringChoice;
	Scanner scan = new Scanner(System.in);
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	void displayMenu() {
		System.out.println();
		System.out.println("1.Reverse");
		System.out.println("2.Sorting");
		System.out.println("3.Go back to main menu");
		System.out.println("Please enter your choice");

	}

	void getChoice() {

		do {
			try {
				displayMenu();
				choice = scan.nextInt();
				switchMethod(choice);
			} catch (InputMismatchException ime) {
				System.out.println("Please enter your choice");
				choice = 0;
				scan.next();

			}
		} while (choice != 3);
	}

	void switchMethod(int choice2) {

		switch (choice) {
		case 1:
			getReverseStringOperationChoice();
			
			break;
		case 2:
			sortString();
			break;
		case 3:
			GetUserChoice guc = new GetUserChoice();
			guc.getMainChoice();
		default:
			System.out.println("Please enter valid choice");

		}
	}

	private void sortString() {
		// TODO Auto-generated method stub

		String original = getString();
		int j = 0;
		char temp = 0;

		char[] chars = original.toCharArray();

		for (int i = 0; i < chars.length; i++) {

			for (j = 0; j < chars.length; j++) {

				if (chars[j] > chars[i]) {
					temp = chars[i];
					chars[i] = chars[j];
					chars[j] = temp;
				}

			}

		}

		for (int k = 0; k < chars.length; k++) {
			System.out.println(chars[k]);
		}

	}

	private void switchOfReverseString(int stringChoice) {

		switch (stringChoice) {
		case 1:
			reverseByCharacter();
			getReverseStringOperationChoice();
			break;
		case 2:
			reverseByString();
			getReverseStringOperationChoice();
			break;
		case 3:
			reverseBySentence();
			getReverseStringOperationChoice();
		case 4:
			getChoice();
			break;
		case 5:
			System.exit(0);
		default:
			System.out.println("Please enter your choice");
			getReverseStringOperationChoice();
		}

		// TODO Auto-generated method stub

	}

	private void reverseBySentence() {
		// TODO Auto-generated method stub
		String str[] = getString().split(" ");
		String finalStr = "";
		for (int i = str.length - 1; i >= 0; i--) {
			finalStr += str[i] + " ";
			
		}
		System.out.println(finalStr);
		char[] strRev = finalStr.toCharArray();
		for (int i = strRev.length - 1; i >=0; i--)
			System.out.print(strRev[i]);
		System.out.println();
	}

	private void reverseByString() {
		// TODO Auto-generated method stub

		String str[] = getString().split(" ");
		String finalStr = "";
		for (int i = str.length - 1; i >= 0; i--) {
			finalStr += str[i] + " ";
		}
		System.out.println(finalStr);

	}

	private void reverseByCharacter() {
		// TODO Auto-generated method stub

		String str = getString();

		char[] strRev = str.toCharArray();
		for (int i = str.length() - 1; i >= 0; i--)
			System.out.print(strRev[i]);
		System.out.println();

	}

	private String getString() {
		String s = null;
		try {
			System.out.print("Please Enter any string: ");
		s=	br.readLine();
		} catch (NullPointerException npe) {
			System.out.println("Don't leave the string empty");
			getString();
		}
		catch(IOException ioe){
			System.out.println("Don't leave the string empty");
			getString();
		}

		return s;
	}

	private void displayStringOperationChoice() {
		System.out.println("1.Reverse by character");
		System.out.println("2.Reverse by string");
		System.out.println("3.Reverse by sentence and then by word");
		System.out.println("4.Back to String Operation Choice");
		System.out.println("5.Exit");
		System.out.println("Please enter your choice");
	}

	private void getReverseStringOperationChoice() {
		do {
			try {
				displayStringOperationChoice();
				stringChoice = scan.nextInt();
				switchOfReverseString(stringChoice);
			} catch (InputMismatchException ime) {
				System.out.println("Please enter your choice");
				stringChoice = 0;
				scan.next();
			}
		} while (stringChoice != 3);
	}
}
