package RandomGame;

import java.util.Scanner;

public class DynamicCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for a: ");
		int a = sc.nextInt();

		System.out.println("Enter value for b: ");
		int b = sc.nextInt();
		System.out.println("Choose the operation\n1-Addtion\n2-Subtraction\n3-Multipliaction\n4-Division");
		int ch = sc.nextInt();

		switch (ch) {
		case 1:
			int add = a + b;
			System.out.println("Addition: " + add);
			break;
		case 2:
			int sub = a - b;
			System.out.println("sub: " + sub);
			break;
		case 3:
			int mul = a * b;
			System.out.println("Multiplication: " + mul);
			break;
		case 4:
			double div = a / b;
			System.out.println("Division: " + div);
			break;
		default:
			System.out.println("invalid");
			sc.close();
		}

	}

}
