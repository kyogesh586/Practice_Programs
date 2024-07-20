package overloading;

public class ConstructorOverloading {

	private int v1;
	private int v2;
	private int v3;
	
	ConstructorOverloading(int v1, int v2, int v3){
		
		this.v1=v1;
		this.v2=v2;
		this.v3=v3;
	}
	
	void sum() {
		
		int total=v1+v2+v3;
		System.out.println("Sum of 3 numbers: "+total);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorOverloading co=new ConstructorOverloading(10, 20, 30);
		co.sum();
	}

}
