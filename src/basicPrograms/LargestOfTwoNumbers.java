package basicPrograms;

public class LargestOfTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findLargestNumber1(10, 20);

	}
	
	public static void findLargestNumber(int a, int b)//1st Method using if 
	{
		if(a>b)
			System.out.println("A is largest");
		
		else
			System.out.println("B is largest");
	}
	
	public static void findLargestNumber1(int a, int b)// 2nd Method using ternary operator
	{
		String result =  (a>b) ? "A is largest": "B is largest";
		
		System.out.println(result);
	}

}
