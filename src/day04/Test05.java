package day04;

import java.util.Arrays;

public class Test05 {

	public static void main(String[] args) {
		int[] num = new int[10];
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 100) + 1;
		}

		
		  System.out.println(Arrays.toString(num));
		  
		  int[] temp = new int[num.length * 2];
		  
		  
		  System.arraycopy(num, 0, temp, 0, num.length);
		  
		  System.out.println(Arrays.toString(temp));
		  
		 
	}
}
