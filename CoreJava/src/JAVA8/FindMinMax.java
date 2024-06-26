package JAVA8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMinMax {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(3,1,3,4,2,5,6,7,3,6,4,7,8,3);

        Integer max = Collections.max(numbers);
        System.out.println("The Maximum number is : " + max);

        Integer min = Collections.min(numbers);
        System.out.println("The Minimum number is : " + min);

        

     

	}

}
