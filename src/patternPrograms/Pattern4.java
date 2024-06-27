package patternPrograms;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=4;
		for(int i=1; i<= num; i++) {
			
			for(int j=num; j>=i; j-- ) {
				
				System.out.print(" ");
			}
			int count =1;
			for(int k=1; k<=i; k++) {
				System.out.print((count++)+" ");
			}
			System.out.println();
		}

	}

}
