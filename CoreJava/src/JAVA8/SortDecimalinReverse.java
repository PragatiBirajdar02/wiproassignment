package JAVA8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortDecimalinReverse {

	public static void main(String[] args) {
		 List<Double> listdecimal = new ArrayList<>();
		 listdecimal.add(3.14);
		 listdecimal.add(1.618);
		 listdecimal.add(2.718);
	        
	        Collections.sort(listdecimal, Collections.reverseOrder());
	        
	      
	        System.out.println("The sorted list in reverse order:");
	        for (Double d : listdecimal) {
	            System.out.println(d);
	        }

	}

}
