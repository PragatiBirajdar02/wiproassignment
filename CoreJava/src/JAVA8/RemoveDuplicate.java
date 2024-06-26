package JAVA8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {

	public static void main(String[] args) {
		 List<Integer> duplicatenumbers = Arrays.asList(3,4,4,6,8,9,3,4,5,6,3);
		  System.out.println("The Original list is: " + duplicatenumbers);
	     List<Integer> withoutduplicatenumbers = duplicatenumbers.stream().distinct().collect(Collectors.toList());
	      System.out.println("The List without duplicates Numbers: " + withoutduplicatenumbers);
	   
	                                                
	                                                


	}

}
