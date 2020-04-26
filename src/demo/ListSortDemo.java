package demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListSortDemo {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(99, 12, 54, 32, 23, 65);
//		Collections.sort(list);
		list.sort((num1, num2) -> num1 - num2);
		list.forEach(num -> System.out.print(num + " "));
	}

}
