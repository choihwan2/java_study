package util;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class MyUtil {

	public static int[] sort(int[] a) {
		int[] num = a.clone();
		for (int i = 0; i < num.length - 1; i++) { // 마지막을 빼는 이유는 이미 정렬되어 있는 거기때문에 할 이유가없음.
			int min = i;
			for (int j = i + 1; j < num.length; j++) { // 본인과 비교를 피하기 위해 +1
				if (num[min] > num[j]) {
					min = j;
				}
			}
			if (i != min) {
				swap(num, i, min);
			}
		}
		return num;
	}

	public static void swap(int[] num, int i, int min) {
		int temp = num[i];
		num[i] = num[min];
		num[min] = temp;
	}

	public static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}

	// 두개의 정수를 입력받아 큰값을 리턴해주는 max 함수
	public static int max(int x, int y) {
		int max = 0;
		if (x > y)
			max = x;
		else {
			max = y;
		}
		return max;
	}

	public static void iteratorPrint(Set<String> booklist) {
		Iterator<String> it = booklist.iterator();
		while (it.hasNext()) {
			String string = (String) it.next();
			System.out.println(string);
		}
	}

	
	public static void iteratorPrint(List<String> list) {
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String string = (String) it.next();
			System.out.println(string);
		}
	}

}
