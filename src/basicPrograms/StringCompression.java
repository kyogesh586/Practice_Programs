package basicPrograms;

public class StringCompression {

	
	public static String compress(String str) {
		
		String compressed = "";
		int count = 1;
		
		for(int i=0; i<str.length(); i++) {
			
			if(i + 1 < str.length() && str.charAt(i) == str.charAt(i+1)) {
				
				count++;
			}
			
			else {
				
				compressed += str.charAt(i);
				compressed += count;
				count = 1;
			}
		}
		
		return compressed.length() < str.length() ? compressed : str;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "aabcccccaaa";
		System.out.println(compress(str));

	}

}
