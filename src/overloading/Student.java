package overloading;

public class Student {

	String SID, Sname;
	int Sub1,Sub2,Sub3;
	public static void main(String[] args) {
	
		Student std1=new Student();
		std1.getStuData("St_01", "Sameer");
		std1.getStuMarks(42, 38, 47);
		std1.totalMarks();
		
		std1.getStuData("St_02", "Ranjeet");
		std1.getStuMarks(32, 48, 37);
		std1.totalMarks();

	}
	
	//Takes student details SID and Sname as parameters and assign them to variables
	void getStuData(String SID, String Sname) {
		
		this.SID=SID;
		this.Sname=Sname;
	}
	
	//Takes student marks as parameters and assign them to Sub1, Sub2, Sub3.
	void getStuMarks(int Mark1, int Mark2, int Mark3) {
		
		Sub1=Mark1;
		Sub2=Mark2;
		Sub3=Mark3;
		
	}
	
	//Calculate total marks and print the student details with total marks
	void totalMarks() {
		int TotalMarks= Sub1+Sub2+Sub3;
		
		System.out.println("Total marks of "+Sname+"("+SID+"): "+ TotalMarks);
		
	}

}
