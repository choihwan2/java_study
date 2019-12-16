package day04;

import java.util.Arrays;

//-------------  연습해보세요~~~  --------

//예제) 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때 
//      몇까지 더해야 총합이  100  이상이 되는지 구하시오 .
//

public class SelfTest {

	public static void main(String[] args) {
//		//예제 )문자열 참조변수  msg 가 "yes" 일때 true 인  조건식 
//		String msgString = "";
//		if(msgString.toLowerCase().equals("yes")) {
//			System.out.println("msgString은 yes입니다.");
//		}
//		//예제)arr 배열 에 담긴 모든 값을 더하는 프로그램을 완성하시오  .
//		int[] arr = {10, 20, 30, 40, 50}; 
//		int sum = 0;
//		for (int i : arr) {
//			sum += i;
//		}
//		System.out.println(sum);
//		boolean flag = true;
//		int sum = 1;
//		int temp = 1;
//		int go = 1;
//		int reverse = -1;
//		while (flag) {
//			if (sum >= 100) {
//				flag = false;
//				System.out.println(temp);
//			}
//			go++;
//			temp = go * reverse;
//			reverse *= reverse;
//			sum += temp;
//		}

		int num[] = new int[100];
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 100 + 1);
			int j = 0;
			while (true) {
				if (num[i] == num[j] && i != j) {
					j = 0;
					num[i] = (int) (Math.random() * 100 + 1);
				}
				j++;
				if (j > i) {
					break;
				}
			}
		}
		Arrays.parallelSort(num);
		System.out.println(Arrays.toString(num));
	}
}
