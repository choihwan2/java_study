package day04;

public class Test03 {
	public static void main(String[] args) {
		A: for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				if (j == 5)
					break A;	//A 라고 라벨링한 반복문을 빠져나옴.
				System.out.printf("%d * %d = %2d| ", j, i, i * j);
			}
			System.out.println();
		}
	}
}
