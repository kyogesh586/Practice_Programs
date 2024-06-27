package basicPrograms;

public class EvenOrOddNumber 
{
	public static void main(String args[])
	{
		evenOrOdd(12);
	}
	
	public static void evenOrOdd(int num)
	{
		int res = num%2;
		if(res==0)
			System.out.println("Number is even");
		
		else
			System.out.println("Number is odd");
	}
	
}
