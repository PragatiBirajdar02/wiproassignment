package JAVA8;

public class SumofAllDigits {
	  public static int sumOfAllDigits(int num) {
	        return String.valueOf(num).chars().map(Character::getNumericValue) .sum();
	                             
	    }
	public static void main(String[] args) {
		 int num = 54362;
	        int sum = sumOfAllDigits(num);
	        System.out.println("The Sum of All Digits " + num + " is: " + sum);
	    }
	    
	  

	}


