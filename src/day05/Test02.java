package day05;

import java.util.Arrays;

public class Test02 {
	public static void main(String[] args) {
		int[][] t1 = new int[4][3];

		for (int i = 0; i < t1.length; i++) {
			for (int j = 0; j < t1[i].length; j++) {
				System.out.print(t1[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("--------------------");

		for (int i = 0; i < t1.length; i++) {
			System.out.println(Arrays.toString(t1[i]));
		}

		int[][] t2 = { { 1, 2, 3 }, { 2, 3, 4, 5, 56, 1, 2, 3, }, { 3, 1, 3, 2, 3, 4 } };

		for (int i = 0; i < t2.length; i++) {
			for (int j = 0; j < t2[i].length; j++) {
				System.out.print(t2[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("--------------------");
		
		char[] c = {'A', 'B', 'C', 'F', 'E'};
		System.out.println(Arrays.toString(c));
		
		String aString = "abjasjfksdkh";
		
		char [] aa = aString.toCharArray();
		
		System.out.println(Arrays.toString(aa));
	}
}
