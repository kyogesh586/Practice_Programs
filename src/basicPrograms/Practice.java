package basicPrograms;

public class Practice {

	public static void main(String[] args) {
		
		int number=12321;
		int revNumber=0;
		while(number!=0) {
			int mod=number%10;
			number=number/10;
			revNumber=(revNumber*10)+mod;
		}
		
		//System.out.println(revNumber);
		
		if(revNumber == number) {
			System.out.println("Number is Palindrome");
		}
	}
}
