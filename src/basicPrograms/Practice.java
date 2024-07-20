package basicPrograms;

public class Practice {

	public static void main(String[] args) {
        String input="Nitin";
        String output= new String();
       
        for(int i=0; i<input.length(); i++) {
        	
        	for(int j=0; j<output.length(); j++) {
        		
        		if(input.charAt(i)!=output.charAt(j)) {
        			
        			output=output+input.charAt(i);
        		}
        	}
        }
        System.out.println("String after removing duplicate characters: "+output);
    }
}
