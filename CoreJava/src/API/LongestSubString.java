package API;

import java.util.HashMap;

public class LongestSubString {

	 public static int lengthoflongestsubstring(String s) {
	        HashMap<Character, Integer> map = new HashMap<>();
	        int maxLength = 0;
	        int left = 0;

	        for(int r = 0;r < s.length();r++) {
	            char c= s.charAt(r);

	            if (map.containsKey(c)) {
	                left=Math.max(left, map.get(c) + 1);
	            }

	            map.put(c, r);
	            maxLength=Math.max(maxLength,r-left+1);
	        }

	        return maxLength;
	    }
	
	public static void main(String[] args) {
		

		 String str = "pqrporr";
	     System.out.println("Length of Lognest Substring is : " + lengthoflongestsubstring(str));
	    }

}
