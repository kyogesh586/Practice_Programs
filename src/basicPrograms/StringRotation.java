package basicPrograms;

public class StringRotation {

	
	public static boolean isRotation(String s1, String s2) {
		
		if(s1.length() != s2.length()) {
			
			return false;
		}
		
		String concatenated = s1+s1;
		return concatenated.contains(s2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "waterbottle";
		String s2 = "erbottlewat";
		
		System.out.println(isRotation(s1, s2));
	}

}
