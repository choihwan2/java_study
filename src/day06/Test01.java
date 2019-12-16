package day06;

import java.util.Arrays;

import day05.Calc;
import util.MyUtil;

public class Test01 {
	public static void main(String[] args) {
		System.out.println(Calc.add(1, 1));

		int[] d = { 31, 2, 23, 4, 35, 6, 7, 18, 9 };
		int[] r = MyUtil.sort(d);
		System.out.println(Arrays.toString(d));
		System.out.println(Arrays.toString(r));
		
		System.out.println("======================");
		System.out.println(MyUtil.max(55, 11));
	}
}
