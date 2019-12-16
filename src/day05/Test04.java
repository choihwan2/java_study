package day05;

public class Test04 {
	public static void main(String[] args) {
		int[] num = { 1, 2, 3, 4, 5, 6, 7, 1 };
		for (int data : num) {
			if (data % 2 != 0)
				System.out.print(data);
		}

		System.out.println();

		char[] c = "ABCD".toCharArray();
		for (char data : c) {
			System.out.print(data + " ");
		}
		System.out.println();

	}
}
