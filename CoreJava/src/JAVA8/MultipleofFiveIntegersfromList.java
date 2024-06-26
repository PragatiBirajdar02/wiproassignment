package JAVA8;

import java.util.Arrays;
import java.util.List;

public class MultipleofFiveIntegersfromList {

	public static void main(String[] args) {
         List<Integer> numbers = Arrays.asList(5,10,14,15,20,34,35,50,55,56,57);
         numbers.stream().filter(num -> num % 5 == 0).forEach(System.out::println);
        
       
               
               

	}

}
