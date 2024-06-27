package basicPrograms;

import java.util.Scanner;

public class Palindrome2PointerApproach {

	static boolean isPalindrome(String str) {
		
		int i=0, j= str.length()-1;
		
		while(i<j) {
			
			if(str.charAt(i) != str.charAt(j)) {
				return false;
			}
			
			i++;
			j--;
		}
		
		return true;
	}
	
	public static void main(String arg[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a Palindrome String");
		
		String str = sc.nextLine();
		
		str = str.toLowerCase();
		
		if(isPalindrome(str)) {
			System.out.println("You have entered a Palindrome String");
		}
		
		else {
			System.err.println("You haven't enetered a Palindrome String");
		}
	}
}
