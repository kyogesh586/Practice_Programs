package overloading;

public class Calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculation cal=new Calculation();
		System.out.println(cal.sum(10, 20));
		System.out.println(cal.sum(10, 20, 30));
		System.out.println(cal.sum(9.2, 20.8));
		System.out.println(cal.sum(9.2, 20.7, 30.1));

	}
	
	//Should accept two integer parameters and returns sum of two numbers.
			int sum(int x, int y) {
				
				return x+y;
			}
			
			//Should accept three integer parameters and returns sum of three numbers.
			int sum(int x, int y, int z) {
				
				return x+y+z;
			}
			
			//Should accept two double type parameters and returns sum of two numbers.
			double sum(double x, double y) {
				
				return x+y;
			}
			
			//Should accept three double type parameters and returns sum of three numbers.
			double sum(double x, double y, double z) {
				
				return x+y+z;
			}

}
