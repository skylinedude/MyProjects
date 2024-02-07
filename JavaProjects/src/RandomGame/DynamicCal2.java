package RandomGame;

import java.util.Scanner;

public class DynamicCal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter value for n1");
		int n1 = s.nextInt();
		System.out.println("enter value for n2");
		int n2 = s.nextInt();
		System.out.println("enter choise");
		System.out.println("enter add for addition");
		System.out.println("enter sub for subtraction");
		System.out.println("enter mul for multiplication");
		System.out.println("enter div for division");
		String ch = s.next();
		
		int add = n1 + n2;

		int sub = n1 - n2;

		int mul = n1 * n2;

		float div = n1 / n2;

		if (ch.equals("add")) {
			System.out.println("Addition: " + add);
		} else if (ch.equals("sub")) {
			System.out.println("Subtraction: " + sub);
		} else if (ch.equals("mul")) {
			System.out.println("Multiplication: " + mul);
		} else if (ch.equals("div")) {
			System.out.println("Division: " + div);
		} else {
			System.out.println("Please Enter Valid operation");
			System.out.println();
			s.close();
		}

	}

}
