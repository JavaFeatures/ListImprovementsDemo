package demo;

import java.util.Arrays;
import java.util.List;

public class ReplaceAllDemo {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Apple", "Mango", "Banana");
//		for (int i = 0; i < list.size(); i++) {
//			list.set(i, list.get(i).toUpperCase());
//		}
		list.replaceAll(str -> str.toUpperCase());
		for (String str : list) {
			System.out.println(str);
		}
	}

}
