package basicPrograms;

public class FibonacciNumber {
	
	static int fib(int n) {
		
		int a=0, b=1, c;
		System.out.println(a);
		System.out.println(b);
		
		if(n==0) 
			return 0;
		for(int i=2; i<=n; i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.println(b);
		}
		return b;
	}

	public static void main(String args[]) {
		
		int n=11;
		fib(n);
	}
}
