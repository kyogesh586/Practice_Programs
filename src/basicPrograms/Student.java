package basicPrograms;

public class Student {

	
	int id;
    int age;
    String name;
    boolean isPermanent;

    public void setAge() {
        //this.age = (double) age;
    }

    void displayAge(){
        System.out.println(age);
    }

    public static void main(String args[]) {

        Student emp = new Student();
        emp.setAge();
        emp.displayAge();
    }
}
