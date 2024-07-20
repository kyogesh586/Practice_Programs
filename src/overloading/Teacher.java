package overloading;

public class Teacher {

	String 	designation = "Teacher";
	String collegeName = "BusyQA";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComputerTeacher ct=new ComputerTeacher();
		ct.does();
	}
	
	void does() {
		
		System.out.println("Desgination is: "+designation+" and collegeName is : "+ collegeName);
	}
	

}

 class ComputerTeacher extends Teacher {
	
	
}
