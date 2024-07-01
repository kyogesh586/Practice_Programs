package basicPrograms;

public class ArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayPractice AP=new ArrayPractice();
		//System.out.println("Sum of Array: "+ AP.add());
		AP.searchString();
	}
	
	int arr[]= new int[] {3,7,4,9,2};
	public int add() {
	
		int add=0;
		
		for(int i=0; i<5; i++) {
			
			add=add+arr[i];
		}
		
		return add;
	}
	
	public void searchNumber() {
		
		int target=9;
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]==target) {
				
				System.out.println("Number found at "+i+" location");
			}
		}
	}
	
	public void searchString() {
		
		String target="Yogesh";
		String arr[]=new String[] {"Rinku", "Yogesh", "Bunty", "Deepak", "Pawan"};
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i].equals(target)) {
				
				System.out.println("String "+target+" found at "+i+" location");
			}
		}
	}
}
