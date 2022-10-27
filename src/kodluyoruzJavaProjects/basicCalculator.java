package kodluyoruzJavaProjects;

import java.util.Scanner;

public class basicCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int value1, value2, select;

		System.out.print("Enter the first number");
		value1 = input.nextInt();
		System.out.print("Enter the second number");
		value2 = input.nextInt();
		System.out.println("Select operation :");
		System.out.println("1)+ \n2)- \n3)* \n4)/");
		System.out.print("---->");
		select = input.nextInt();

		switch (select) {
		case 1: // +
			System.out.print(value1 + value2);
			break;
		case 2: // -
			System.out.println(value1 - value2);
			break;
		case 3: // *
			System.out.println(value1 * value2);
			break;
		case 4: // /
			if (value2 == 0) {
				System.out.println("A number cannot be divided by 0!");
				System.out.println("Choose a number other than 0.");
			} else
				System.out.println(value1 / value2);
			break;
		default:  
			System.out.println("invalid input");
		
		}

	}

}
