
public class PersonObject {
	
	public static void main(String[] args) {
		Person p = new Person();
		p.employee("Harika","F","Application Developer",27);
		Person.salary=10000000;
		Person.getSalary();
		p.student("Nikhitha","F",23);
		p.student("Computer Science");
		
		
		Person p1 = new Person();
		Person.salary=20000000;
		p1.employee("Vasudha","F","Application Developer",27);
		Person.getSalary();
		p1.student("Harshini","F",23);
		p1.student("Computer Science");
		
		
		
		
	}

}
