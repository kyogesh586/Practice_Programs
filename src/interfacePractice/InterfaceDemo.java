package interfacePractice;

interface A {

	int sum();
}

class B implements A {
	
	private int a, b;
	
	public B(int a, int b) {
		
		this.a=a;
		this.b=b;
	}
	
	public int sum() {
		
		return a+b;
	}
}

public class  InterfaceDemo{
	
    public static void main(String[] args) {
        // Creating an object of class B
        B obj = new B(5, 3);

        // Calling the sum() method through the interface reference
        int result = obj.sum();

        // Displaying the result
        System.out.println("Sum of a and b is: " + result);
    }
}
