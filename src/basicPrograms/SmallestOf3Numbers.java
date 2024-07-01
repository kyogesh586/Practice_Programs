package basicPrograms;

public class SmallestOf3Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getSmallestNumber(10, 15, 5);
	}
	
	public static void getSmallestNumber(int a, int b, int c)
	{
		if(a<b && a<c)
		System.out.println("A is smallest");
		
		else if(b<a && b<c)
			System.out.println("B is smallest"); 
		
		else
			System.out.println("C is smallest");
	}

}
