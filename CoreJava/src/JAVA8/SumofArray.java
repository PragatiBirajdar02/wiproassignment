package JAVA8;

public class SumofArray {

	public static void main(String[] args) {
		int[] arr = {2,4,6,8,3,5,7,9,5,3,5,7,4};
		int sum=0;
		
		for(int i: arr)
			sum +=i;
		System.out.print("Sum of array: "+sum+"\nAverage of array: ");
		System.out.println(sum/arr.length);
	}
	}

