package day10;

import java.util.List;
import java.util.Vector;


public class Test04 {
	public static void main(String[] args) {
		//List<String> list = new ArrayList<String>();
		List<String> list = new Vector<String>();
		
		list.add("최환");
		list.add("조규찬");
		list.add("이진호");
		list.add("송영재");
		list.add("권혁락");
		System.out.println(list.toString());
		
		System.out.println("이진호 ? " + list.contains("이진호"));
		
		System.out.println("=============Iterator 기반 순회 =================");
//		Iterator<String> it = list.iterator();
//		while (it.hasNext()) {
//			String string = (String) it.next();
//			System.out.println(string.charAt(0)+ "**");
		}
//		System.out.println("=============Iterator 기반 삭제 =================");
//		it = list.iterator();
//		String rname = JOptionPane.showInputDialog("삭제할 이름을 입력하세요");
//		while (it.hasNext()) {
//			String string = (String) it.next();
//			if(rname.equals(string)) {
//				it.remove();
//			}
//		}
//		System.out.println(list);
//		list.add(2, "~~~~");
//		System.out.println(list);
		
		
		
//	}

}
