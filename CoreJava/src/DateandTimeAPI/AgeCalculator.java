package DateandTimeAPI;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);  
      System.out.print("Enter birth date in yyyy-mm-dd format: ");  
        String input = sc.nextLine();  
      LocalDate birthdate = LocalDate.parse(input);  
      LocalDate currentdate = LocalDate.now();  
        
     
        if ((birthdate != null) && (birthdate != null))   
        {  
            Period age = Period.between(birthdate, currentdate); 
            System.out.print("Your Age: ");  
            System.out.println(age.getYears()+" Years "+age.getMonths()+" Months "+age.getDays()+" Days");
        }  
        sc.close();

	}

}
