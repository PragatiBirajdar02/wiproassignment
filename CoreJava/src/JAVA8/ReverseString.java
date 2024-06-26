package JAVA8;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseString {

	public static void main(String[] args) {
		String str = "My Name is Pragati";
		System.out.println("The String: " + str);
		
		String reversestring = Arrays.stream(str.split(" ")).map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));
		 System.out.println("Reverse words: " + reversestring);

	}

}
