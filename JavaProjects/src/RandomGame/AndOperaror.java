package RandomGame;

public class AndOperaror {
	public static void main(String[] args) {
		
		int a = 10, b = 20, c = 20, sum;

		if ((a < b) && (b == c)) {
			sum = a + b + c;
			System.out.println("The sum is: " + sum);
		} else
			System.out.println("False conditions");
	}
}
