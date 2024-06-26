package JAVA8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLargestNumber {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(5, 9, 11, 2, 8, 21, 1);
       System.out.println("List of Integer : " + numbers);
       int secondLargestNumber = numbers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
 
       System.out.println("\nSecond largest number in List is -:" + secondLargestNumber);
 
 
               
                
                
                
                
 
               

	}

}
