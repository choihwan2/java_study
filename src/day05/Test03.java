package day05;

import java.util.Arrays;

public class Test03 {
	public static void main(String[] args) {
//		System.out.println(args.length);
//		System.out.println(Arrays.toString(args));

		int[] num = { 1, 2, 3, 5, 4, 6, 9, 5 };

		// int[] num = new int[] {1, 2, 3};
		char[] a = { '1', '3', 'a', 'A', 'B', 'Z', 'Q', 'x' };
		int[] num2 = num; // 주의해야함 주소가 복사된다.
		int[] num3 = num.clone();
		String nameString = "HWANY ZZZ";
		String temp = nameString.substring(0, 5);
		String url = "http://myweb/admin/login.do";
		
		System.out.println(url.indexOf(':'));		// ':' 문자열 몇번째 위치에있는지 나옴
		System.out.println(url.lastIndexOf("/")); //마지막 슬래쉬 이후의 문자가 나옴
		
		System.out.println(temp);
		num2[2] = 99;

		Arrays.sort(num3);
		Arrays.sort(a);

		System.out.println(Arrays.toString(num));
		System.out.println(Arrays.toString(num2));
		System.out.println(Arrays.toString(num3));
		System.out.println(Arrays.toString(a));

	}


}
