package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AulaList {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();

		list.add("Maria");
		list.add("antonio");
		list.add("mario");
		list.add("jo");
		list.add("de");
		list.add("tonho");
		list.add("toin");
		list.add(2, "Franciel");
		System.out.println(list.size());
		list.remove("Maria");
		list.remove(4);
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("_______________________");

		list.removeIf(x -> x.charAt(0) == 't');

		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("_______________________");
		System.out.println("Index of Franciel: " + list.indexOf("Franciel"));

		System.out.println("_______________________");
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		System.out.println("_______________________");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'F').collect(Collectors.toList());
		
		for (String y : result) {
			System.out.println(y);
		System.out.println("_______________________");
		String name = list.stream().filter(x -> x.charAt(0) == 'a').findFirst().orElse(null);
		System.out.println(name);
		}
	}

}
