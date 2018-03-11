
public class Person {

	String name;
	int age;
	String Gender;
	static double salary;
	String job;
	String Specialization;
	
	
	public void employee(String name, String Gender,String job, int age ) {
		this.name = name;
		this.age= age;
		this.Gender =Gender;
		this.job = job;
		System.out.printf("Name of an employee is:"+name+" "+"Gender:"+Gender+" "+"job:"+job+" "+"Age:"+age+"%n");
		
	   }
	
	//Static method
	public static double getSalary() {
		 return salary;
	}
	
	//method overloading
	public void student(String name, String Gender,int age) {
		this.name =name;
		this.Gender = Gender;
		this.age = age;
		System.out.printf("Name of a student is:"+name+" "+"Gender:"+Gender+" "+"Age:"+age+"%n");
		
		}
	
	//method overloading
	public void student(String Specialization) {
		this.Specialization = Specialization;
		System.out.printf("Specialization of student:"+Specialization+"%n");
	}
	
}
