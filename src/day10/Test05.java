package day10;

import java.util.HashSet;
import java.util.Set;

import util.MyUtil;

public class Test05 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("LEE");
		set.add("hwan");
		set.add("gogo");
		set.add("chapchap");
		set.add("LEE");
//		Iterator<String> it = set.iterator();
//		while (it.hasNext()) {
//			String string = (String) it.next();
//			System.out.println(string);
//		}
		
		MyUtil.iteratorPrint(set);
	}
	

}
