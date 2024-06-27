package patternPrograms;

public class Pattern6 {

	public static void main(String[] args) {
		
		int num=7;
		
		for(int i=0; i<4; i++) {
			
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			
			for(int k=0; k<num; k++) {
				System.out.print("*");
			}
			
			System.out.println();
			num=num-2;
		}

	}

}
