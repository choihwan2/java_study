package day09;

public class Test06 {
	public static void main(String[] args) {
		System.out.println("start");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("===============");
		try {
			throw new Exception("예외 실습");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end");
	}
}
