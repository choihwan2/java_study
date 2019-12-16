package day02;

import java.util.Date;

public class Test02 {
	public static void main(String[] args) {
		String msg = "Hello java~~";
		Date date = new Date();
		
		System.out.println(msg.length());
		 
		int size = msg.length();
		
		System.out.println(size);
		
		System.out.println(msg.toUpperCase());
		
		
		System.out.println(msg);
		System.out.println(date);
		//System.out.println(date.toLocaleString()); // 디플리먼트된 API 예전에는 썻지만 지금은 안쓰는 메소드. 
		
		
		
	}
}
