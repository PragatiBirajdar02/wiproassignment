package Array;

public class RotateArrayofIntegers {

	public static void main(String[] args) {
      int arr[] = new int[] {1,2,3,4,5,6,7};
	    int n=arr.length;
	    int k=3; 
	    k=k % n;
	    int i, j;
	       for(i=n-k,j=n-1;i<j;i++,j--)
	       {
	    	 int t = arr[i];
	    	 arr[i] = arr[j];
	    	 arr[j] = t;
	       }
	       for(i=0,j=n-k-1;i<j;i++,j--) 
	       {
	    	  int a = arr[i];
	    	  arr[i] = arr[j];
	    	  arr[j] = a;
	       }
	       for(i=0,j=n-1;i<j;i++,j--) 
	       {
	    	  int temp = arr[i];
	    	  arr[i] = arr[j];
	    	  arr[j] = temp;
	       }
	       
	     
	       for(int t=0;t<n;t++) 
	       {
	    	   System.out.print(arr[t] + " ");
	       }
	}
	       

	      


}
