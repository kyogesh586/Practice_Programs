package patternPrograms;

public class Pattern5 {

	public static void main(String[] args) {
		
		int num=4;
		int count=1;
		for(int i=1; i<=num; i++) {
			
			for(int j=num; j>i; j--)
			{
				System.out.print(" ");
			}
			
			for(int k=1; k<=i; k++) {
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}

	}

}
