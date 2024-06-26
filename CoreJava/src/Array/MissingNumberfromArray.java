package Array;

public class MissingNumberfromArray {
	 private static int missingnumber(int[] arr, int num) {
	        int sum = (num * (num + 1)) / 2; 
	        int actualSum = 0;
	        
	        for (int i : arr) {
	            actualSum += i; 
	        }
	        
	        return sum - actualSum; 
	        }

	public static void main(String[] args) {
		 int[] arr = {0, 1, 2, 3, 4, 5, 6, 8, 9};
	        int num = 9; 
	        
	        int missingNumber = missingnumber(arr, num);
	        System.out.println("The Missing Number is: " + missingNumber); 
	    }

}
