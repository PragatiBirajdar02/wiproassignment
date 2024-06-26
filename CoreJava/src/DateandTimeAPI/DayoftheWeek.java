package DateandTimeAPI;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class DayoftheWeek {
	  public static String getDayOfWeek(String date) {
	   try {
	           
	    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	     LocalDate ld = LocalDate.parse(date, dtf);
	     DayOfWeek dow = ld.getDayOfWeek();
	       return dow.toString();
	   } catch (DateTimeParseException e) {
		   return "Invalid date format. Please use yyyy-MM-dd.";
	       }
	  }
	            
	           
	  public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("Enter a date in yyyy-MM-dd: ");
	    String date = scanner.nextLine();
	    String dow = getDayOfWeek(date);
	            
	    System.out.println("The day of week " + date + " is " + dow);
	    scanner.close();
	  }
}
	        
	        
	        
	       
	        
	       
	        
	       


