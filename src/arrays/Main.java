package arrays;

public class Main {

	public static void main(String[] args) {

		int[] numbers = new int[10];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i + 1;
			System.out.print(numbers[i] + ", ");
		}
		System.out.println();
		for (int i = 0; i < numbers.length; i++) {
			
		System.out.print(numbers[i] * 10 + ", ");}

	}

	public static int zeroCheck(int first, int second) {
		int output = 0;
		if (first == 0 && second != 0) {
			output = second;
		} else if (first != 0 && second == 0) {
			output = first;
		} else {
			output = first + second;
		}
		return output;
	}
}
