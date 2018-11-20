package conditionals;

public class Main {

	public static void main(String[] args) {
		boolean operation = true;
		System.out.println(calculate(2, 3, operation));
		operation = false;
		System.out.println(calculate(2, 3, operation));
	}

	public static int calculate(int first, int second, boolean operation) {
		int output = 0;
		if (operation == true) {
			output = first + second;
		} else {
			output = first * second;
		}
		return output;
	}

}
