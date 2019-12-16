package day05;

import java.util.Arrays;

public class Test01 {

	public static void main(String[] args) {
		int size = 5;
		if(args.length != 0) {
			size = Integer.parseInt(args[0]);
		}
		
		int[] num = new int[size];
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 10000) + 1;
			for (int j = 0; j < i; j++) {
				if (num[j] == num[i]) {
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(num));
		for (int i = 0; i < num.length - 1; i++) {	//마지막을 빼는 이유는 이미 정렬되어 있는 거기때문에 할 이유가없음.
			int min = i;
			for (int j = i + 1; j < num.length; j++) {	//본인과 비교를 피하기 위해 +1
				if(num[min] > num[j]) {
					min = j;
				}
			}
			if(i != min) {
				int temp = num[i];
				num [i] = num[min];
				num[min] = temp; 
			}
		}
		System.out.println(Arrays.toString(num));
	}
}
