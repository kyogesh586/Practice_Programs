package basicPrograms;

public class LargestOf3Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkLargestNumber(5, 15, 10);
	}
	
	public static void checkLargestNumber(int a, int b, int c)
	{
		if(a>b && a>c)
			System.out.println("A is greater");
		
		else if(b>a && b>c)
			System.out.println("B is greater");
		
		else
			System.out.println("C is greater");
	}

}
