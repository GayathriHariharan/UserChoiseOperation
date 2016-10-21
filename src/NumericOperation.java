import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class NumericOperation {
	int choice;
	int n;
	int calculatorChoice;
	Scanner scan = new Scanner(System.in);
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	void displayMenu() {

		System.out.println("1.Reverse of a number");
		System.out.println("2.Sorting");
		System.out.println("3.Find Prime Number");
		System.out.println("4.Find Duplicate Number");
		System.out.println("5.Calculator");
		System.out.println("6.Go back to main menu");
		System.out.println("7.Exit");
		System.out.println("Please enter your choice");

	}

	void getChoice() {

		do {
			try {
				displayMenu();
				choice = Integer.parseInt(br.readLine());
				switchMethod(choice);
			} catch (IOException ime) {
				System.out.println("Please enter your choice");
				choice = 0;
				scan.next();
			}
		} while (choice != 6);
	}

	void switchMethod(int choice2) {

		switch (choice) {
		case 1:
			reverseNumber();
			getChoice();
			break;
		case 2:
			sortNumber();
			getChoice();
			break;
		case 3:
			findPrimeNumber();
			getChoice();
			break;
		case 4:
			findDuplicateNumber();
			getChoice();
			break;
		case 5:
			calculator();
			getChoice();
			break;
		case 6:
			GetUserChoice guc = new GetUserChoice();
			guc.getMainChoice();
		case 7:
			System.exit(0);
		default:
			System.out.println("Please enter your choice");
			getChoice();

		}
	}

	private void calculator() {
		// TODO Auto-generated method stub
		getCalculatorChoice();
	}

	private void getCalculatorChoice() {
		// TODO Auto-generated method stub
		do {
			try {
				displayCalculatorChoice();
				calculatorChoice = scan.nextInt();
				switchCalculatorChoice(calculatorChoice);
			} catch (InputMismatchException ime) {
				System.out.println("Please enter your choice");
				calculatorChoice = 0;
				scan.next();
			}
		} while (calculatorChoice != 13);
	}

	private void switchCalculatorChoice(int calculatorChoice2) {
		// TODO Auto-generated method stub
		switch (calculatorChoice2) {
		case 1:
			addition();
			getCalculatorChoice();
			break;
		case 2:
			subtract();
			getCalculatorChoice();
			break;
		case 3:
			multiply();
			getCalculatorChoice();
			break;
		case 4:
			divide();
			getCalculatorChoice();
			break;
		case 5:
			findSquare();
			getCalculatorChoice();
			break;
		case 6:
			findSquareRoot();
			getCalculatorChoice();
			break;
		case 7:
			findSin();
			getCalculatorChoice();
			break;
		case 8:
			findCos();
			getCalculatorChoice();
			break;
		case 9:
			findTan();
			getCalculatorChoice();
			break;
		case 10:
			findHyperbolicSin();
			getCalculatorChoice();
			break;
		case 11:
			findHyperbolicCos();
			getCalculatorChoice();
			break;
		case 12:
			findHyperbolicTan();
			getCalculatorChoice();
			break;
		case 13:
			getChoice();
			break;
		case 14:
			System.exit(0);
		}
	}

	private void findSin() {
		// TODO Auto-generated method stub
		int number = getNumber();
		System.out.println("The result is: " + Math.sin(number));
	}

	private void findSquareRoot() {
		// TODO Auto-generated method stub
		int number = getNumber();
		System.out.println("The Result is: " + Math.sqrt(number));
	}

	private void findHyperbolicTan() {
		// TODO Auto-generated method stub
		int number = getNumber();
		System.out.println("The result is: " + Math.tanh(number));
	}

	private void findHyperbolicCos() {
		// TODO Auto-generated method stub
		int number = getNumber();
		System.out.println("The result is: " + Math.cosh(number));
	}

	private void findHyperbolicSin() {
		// TODO Auto-generated method stub
		int number = getNumber();
		System.out.println("The result is: " + Math.sinh(number));
	}

	private void findTan() {
		// TODO Auto-generated method stub
		int number = getNumber();
		System.out.println("The result is: " + Math.tan(number));
	}

	private void findCos() {
		// TODO Auto-generated method stub
		int number = getNumber();
		System.out.println("The result is: " + Math.cos(number));

	}

	private void findSquare() {
		// TODO Auto-generated method stub
		int number = getNumber();
		System.out.println("The result is: " + (number * number));
	}

	private void divide() {
		// TODO Auto-generated method stub
		System.out.println("This is the first number");
		int number1 = getNumber();
		System.out.println("This is the second number");
		int number2 = getNumber();
		int result1 = (number1 / number2);
		int result2 = (number1 % number2);
		System.out.println("The Result is: " + result1 + result2);
	}

	private void multiply() {
		// TODO Auto-generated method stub
		// System.out.println("Please enter the number of values you want to
		// Subtract");
		int num = getNumberOfValues();
		int mul = 1;
		for (int i = 0; i < num; i++) {
			int number = getNumber();
			mul = number * mul;
		}
		System.out.println("Result: " + mul);

	}

	private void subtract() {
		// TODO Auto-generated method stub
		// System.out.println("Please enter the number of values you want to
		// Subtract");
		int num = getNumberOfValues();
		int sub = 0;
		for (int i = 0; i < num; i++) {
			int number = getNumber();
			sub = number - sub;
		}
		System.out.println("Result: " + sub);

	}

	private void addition() {
		// TODO Auto-generated method stub
		// System.out.println("Please enter the number of values you want to
		// add");
		int num = getNumberOfValues();
		int sum = 0;
		for (int i = 0; i < num; i++) {
			int number = getNumber();
			sum = sum + number;
		}
		System.out.println("Result: " + sum);
	}

	private void displayCalculatorChoice() {
		// TODO Auto-generated method stub
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("5.Find Square");
		System.out.println("6.Find Square root");
		System.out.println("7.Find sin");
		System.out.println("8.Find cos");
		System.out.println("9.Find tan");
		System.out.println("10.Find hyperbolic sin");
		System.out.println("11.Find hyperbolic cos");
		System.out.println("12.Find hyperbolic tan");
		System.out.println("13.Back to Numeric operation choices");
		System.out.println("14.Exit");
		System.out.println("Please enter your choice");

	}

	private void findDuplicateNumber() {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of elements you want to enter");
		int num = getNumber();
		if (num >= 2) {
			int[] numbers = new int[num];
			System.out.println("Now enter those numbers");
			for (int j = 0; j < num; j++) {
				numbers[j] = getNumber();
			}
			for (int i = 0; i < numbers.length; i++) {
				int count =1;
				for (int j = i + 1; j < numbers.length; j++) {
					if (numbers[i] == (numbers[j])) {
						//System.out.println("duplicate element " + numbers[i] + " found");
						count++;

					}
				}
				if(count>0)
					System.out.println("duplicate element " + numbers[i] + " found");
			}
		} else {
			System.out.println("The number of elements must be greater than or equal to 2");
			findDuplicateNumber();
		}
	}

	private void findPrimeNumber() {
		// TODO Auto-generated method stub

		int number = getNumber();
		int k = 0;

		for (int i = 2; i <= (number / 2); i++) {
			if (number % i == 0)
				k++;
		}
		if (k == 0)
			System.out.println(number + " is a prime number");
		else
			System.out.println(number + " is not a prime number");

	}

	private void reverseNumber() {
		// TODO Auto-generated method stub

		int reverse = 0;
		int number = getNumber();

		while (number != 0) {
			reverse = reverse * 10;
			reverse = reverse + number % 10;
			number = number / 10;
		}
		System.out.println("reverse:" + reverse);

	}

	private void sortNumber() {
		// TODO Auto-generated method stub
		int number, temp;
		System.out.println("please mention the number of elements in an array");
		number = getNumber();
		if (number >= 2) {
			int a[] = new int[number];
			System.out.println("Now please enter the elements of array:");
			for (int i = 0; i < number; i++) {
				a[i] = getNumber();
			}
			for (int i = 0; i < number; i++) {
				for (int j = i + 1; j < number; j++) {
					if (a[i] > a[j]) {
						temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}
			}
			System.out.print("Ascending Order: ");
			for (int i = 0; i < number - 1; i++) {
				System.out.print(a[i] + ",");
			}
			System.out.println(a[number - 1]);
		} else {
			System.out.println("array size must be greater than or equal to 2");
			sortNumber();
		}
	}

	private int getNumber() {

		try {

			// System.out.println("Enter Number: ");
			n = Integer.parseInt(br.readLine());
		} catch (IOException ime) {
			System.out.println("Enter valid Number");
		//	Integer.parseInt(br.readLine());
			getNumber();
		}
		return n;
	}

	private int getNumberOfValues() {

		System.out.println("Here you have to enter the number of values you want to perform on: ");
		int nov = getNumber();
		if (!(nov >= 2)) {
			getNumberOfValues();
		}
		return nov;

	}
}
