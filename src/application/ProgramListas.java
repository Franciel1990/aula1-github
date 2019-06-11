package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProgramListas {
	public static void main (String[] args) {
	List<String> list = new ArrayList<>();
	
	list.add("Maria");
	list.add("asdf");
	list.add("sdf");
	list.add("sdfsdf");
	list.add("asdfdsd");
	list.add("sdfsdf");
	list.add("sdfece");
	list.add(2,"Marco");
	
	System.out.println(list.size());
	
	//list.remove("Marco");
	
	
	
	for (String x : list) {
		System.out.println(x);
	}
	System.out.println("--------------------");

	
	list.removeIf(x -> x.charAt(0) == 's');
	
	for (String x : list) {
		System.out.println(x);
	}
	
	System.out.println("--------------------");
		System.out.println("Index of asdf: " + list.indexOf("sdf"));
		System.out.println("--------------------");
		List<String> result = list.stream().filter(x-> x.charAt(0) == 's').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);}
		System.out.println("--------------------");
		String name = list.stream().filter(x-> x.charAt(0) == 's').findFirst().orElse(null);
		System.out.println(name);	
			
		}
	
	
}
