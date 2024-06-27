package basicPrograms;

import java.util.Scanner;

public class IsStringPalindrome {
	
	public static void main(String args[]) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		
		String str = sc.nextLine();
		
		boolean A = isPalindrome(str); 
		System.out.println(A);
	}
	
	public static boolean isPalindrome(String str) {
		
		String rev = "";
		boolean ans = false;
		
		for(int i=str.length()-1; i>=0; i-- ) {
			rev = rev+str.charAt(i);
		}
		System.out.println(rev);
		
		if(str.equals(rev)) {
			ans = true;
		}
		return ans;
	}
}
