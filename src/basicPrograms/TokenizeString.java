package basicPrograms;

public class TokenizeString {

	
	public static String[] tokenize(String str) {
		
		int wordCount = 0;
		for(char c: str.toCharArray()) {
			
			if(c == ' ') {
				
				wordCount++;
			}
		}
		
		String[] words = new String[wordCount+1];
		String word = "";
		int index = 0;
		for(char c : str.toCharArray()) {
			
			if(c == ' ') {
				
				words[index++] = word;
				word = "";
			}
			
			else {
				
				word +=c;
			}
		}
		
		words[index] = word;
		return words;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Hello World Java Programming";
		String[] tokens = tokenize(str);
		for (String token: tokens) {
			
			System.out.println(token);
		}

	}

}
