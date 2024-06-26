package API;

import java.util.Scanner;

public class ReverseString {
	

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str = sc.next();
	
		StringBuffer sb = new StringBuffer();
		
		for(int i=str.length()-1; i>=0; i--) 
			sb.append(str.charAt(i));
		
		System.out.println("Reversed String: "+sb.toString());
		sc.close();

	}

}
