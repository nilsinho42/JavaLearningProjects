package examples;

import java.util.HashSet;
import java.util.Set;

public class Example3 {

	// implementations of java.util.Set
	// java.util.HashSet --> When ordering is not required, doesn't allow repeated values, better performance
	// java.util.LinkedHashSet --> Ordering required, worst performance
	// java.util.TreeSet --> Order change possible, good performance for reading, bad performance for write/changing (even worst than LinkedHashSet)
	
	public static void main(String[] args)
	{
		Set<Double> StudentsGrades = new HashSet<>();
		StudentsGrades.add(5.8);
		StudentsGrades.add(4.2);
		StudentsGrades.add(6.6);
		StudentsGrades.add(5.3);
		StudentsGrades.add(7.5);
		StudentsGrades.add(5.9);
		StudentsGrades.add(4.1);
		StudentsGrades.add(9.7);
		StudentsGrades.add(8.3);
		StudentsGrades.add(6.6); // note that the repeated value was not added to the set
		
		System.out.println(StudentsGrades);
		// note that the order in PRINT is different of the order of addition of element to the set
	}
}
