package conditionalsTwo;

public class Main {

	public static void main(String[] args) {
		System.out.println(zeroCheck(0,1));
		System.out.println(zeroCheck(1,0));
		System.out.println(zeroCheck(1,1));
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