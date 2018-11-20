package iteration;

public class Main {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			System.out.println(zeroCheck(i, 3));
		}

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
