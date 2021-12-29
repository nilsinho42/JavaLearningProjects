package examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class Example1 {
	public static void main(String[] args) {
		List<String> nomes = new ArrayList<>();
		nomes.add("Carlos");
		nomes.add("Pedro");
		nomes.add("Maria");
		nomes.add("José");
		
		System.out.println(nomes);
		
		// To ordenate
		Collections.sort(nomes);
		System.out.println(nomes);

		// To insert value to a known index
		// It substitutes values existing in that index
		int pos = 3;
		nomes.set(pos, "João");
		System.out.println(nomes);
		
		// To remove a value from a known index
		nomes.remove(pos);
		System.out.println(nomes);
		
		// To remove a known value from wherever it is
		nomes.remove("José");
		System.out.println(nomes);
		
		// To get a value from a known index
		String nome = nomes.get(1);
		System.out.println(nome);

		// To get the length of the list
		int lengthList = nomes.size();
		System.out.println(lengthList);
		
		// To search if the list contains some value
		String value = nome;
		boolean hasValue = nomes.contains(value);
		System.out.println(hasValue);

		// To check if the list is empty
		boolean checkEmpty = nomes.isEmpty();
		System.out.println(checkEmpty);

		// To check index of a element in the list
		int elementIndex = nomes.indexOf(nome);
		System.out.println(elementIndex);
		// if a element it's not found, it returns -1

		// To empty list
		nomes.clear();
		checkEmpty = nomes.isEmpty();
		System.out.println(checkEmpty);
		
		nomes.add("Carlos");
		nomes.add("Pedro");
		nomes.add("Maria");
		nomes.add("José");
		
		// To iterate over values
		for (String name : nomes)
		{
			System.out.println(name);

		}
		
		// To iterate over values
		Iterator<String> iterator = nomes.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
