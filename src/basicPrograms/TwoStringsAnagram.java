package basicPrograms;

import java.util.Arrays;

public class TwoStringsAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "listen";
		String str2 = "silent";
		
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		
		if(areAnagram(arr1, arr2))
			System.out.println("The two strings are" + "anagram of each other");

		else
			System.out.println("The two strings are not" + " anagram of each other");
		
	}
	
	static boolean areAnagram(char[] str1, char[] str2) {
		
		Arrays.sort(str1);
		Arrays.sort(str2);
		
		if(str1.length!=str2.length) {
			
			return false;
		}
		
		else {
			
			for(int i=0; i<str1.length; i++) {
				
				if(str1[i]!=str2[i]) {
					
					return false;
				}
			}
			
			return true;
		}
		
		
	}

}
