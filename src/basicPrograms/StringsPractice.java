package basicPrograms;

public class StringsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Yogesh";
		
		StringsPractice sp=new StringsPractice();
		System.out.println("String in lowercase is: "+sp.ConvertStringInLowercase(name));
	}
	
	//Write a java program to compare two strings, ignoring case differences.
	void compareStringsCase(String str) {
		
		if(str.equalsIgnoreCase("yogesh")) {
			
			System.out.println("Strings matched in case sensative");
		}
		
		else
			System.out.println("Ooops! String not matched case sensative");
	}
	
	void compareStrings(String str) {
		
		if(str.equals("yogesh"))
			System.out.println("String matched in not case sensative");
		
		else
			System.out.println("String not matched in not case sensative");
	}
	
	//Write a Java program to concatenate a given string to the end of another string. 
	protected String concatenateStringsre(String str) {
		
		String result= "Hello! "+str;
		return result;
	}
	
	//Write a java program to get the length of a given string
	private int stringLength(String str) {
		
		int lnth=str.length();
		return lnth;
	}
	
	//Write a Java program to get a substring of a given string between two specified positions
	String getSubstring(String str) {
		
		String substr=str.substring(1, 4);
		return substr;
	}
	
	//Write a Java program to convert all the characters in a string to uppercase.
	String convertStringInUppercase(String str) {
		
		String upperCase=str.toUpperCase();
		return upperCase;
	}
	
	//Write a Java program to convert all the characters in a string to lowercase
	String ConvertStringInLowercase(String str) {
		
		String lowercase=str.toLowerCase();
		return lowercase;
	}

}
