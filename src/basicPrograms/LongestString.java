package basicPrograms;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LongestString {

	int lengthOfLongestSubstring(String str) {
		
		int n = str.length();
		int maxLength = 0;
		Set<Character> charSet = new HashSet<Character>();
		int left = 0;
		
		for(int right=0; right<n; right++) {
			
			if(!charSet.contains(str.charAt(right))) {
				
				charSet.add(str.charAt(right));
				maxLength = Math.max(maxLength, right - left + 1);

			}
			
			else
			{
				while(charSet.contains(str.charAt(right))) {
					
					charSet.remove(str.charAt(left));
					left++;
				}
			}
		}
		
		System.out.println(charSet);
		return maxLength;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "abcabcbb";
		LongestString ls = new LongestString();
		System.out.println(ls.lengthOfLongestSubstring(str));
	}

}
