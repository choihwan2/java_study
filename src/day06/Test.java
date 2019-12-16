package day06;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arrNum[] = new int[10001]; // 0 ~ 9999
		for (int i = 0; i < arrNum.length; i++) {
			if (hint(i) <= 10000) {
				arrNum[hint(i)]++;
			}
		}
		for (int i = 0; i < arrNum.length; i++) {
			if (arrNum[i] == 0) {
				System.out.println(i);
			}
		}
	}

	public static int hint(int num) {
		int sum = num;
		while (num > 0) {
			sum += num % 10;
			num /= 10;
		}
		return sum;
	}
}
