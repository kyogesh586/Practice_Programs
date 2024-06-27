package basicPrograms;

public class Complex {
	
	private double re, im;
	
	public Complex(double re, double im) {
		
		this.re = re;
		this.im = im;	
		System.out.println("Default Value : "+ re);
		System.out.println("Default Value : "+ im);
	}
	
	public Complex(Complex c) {
		
		System.out.println("Copy Constructor Called");
		
		re = c.re;
		im = c.im;
		
		System.out.println(re);
		System.out.println(im);
	}
	
	public String ToString() {
		
		return "("+re+"+"+im+"i)";
	}
	
	public static void main(String args[]) {
		
		Complex c1 = new Complex(10,15);
		Complex c2 = new Complex(c1);
		
		Complex c3 = c2;
		
		System.out.println(c2);	
	}

}
