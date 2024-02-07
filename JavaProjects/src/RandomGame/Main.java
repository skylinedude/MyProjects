package RandomGame;

interface Calculator {
	int calculate(int a, int b);
}

class MathUtil {
	public static int add(int a, int b) {
		return a + b;
	}
}

public class Main {
	public static void main(String[] args) {
		Calculator calculator = MathUtil::add;
		int result = calculator.calculate(5, 3);
		System.out.println("Result: " + result);
	}
}
