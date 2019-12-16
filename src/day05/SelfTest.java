package day05;

// 16진수를 2진수로 바꾸는 배열 연습
public class SelfTest {
	public static void main(String[] args) {
		char[] hex = { 'C', 'A', 'F', 'E' };

		String[] binary = { "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010",
				"1011", "1100", "1101", "1110", "1111" };

		String result = "";

		for (int i = 0; i < hex.length; i++) {
			if (hex[i] >= '0' && hex[i] <= '9') {
				// 0 1 2 3 4
				// 48 49 50
				result += binary[hex[i] - '0'];
			} else {
				// A B C D
				// 65 66 67 68
				result += binary[hex[i] - 'A' + 10] + " ";
			}
		}
		System.out.println(result);

	}
}
