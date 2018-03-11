
public class Circle {
	 
	float radius;
	double area;
	double circumference;
	double diameter;
	
	public void AreaOfCircle(float radius) {
	    area = 3.14*radius*radius;
        System.out.println("Area of circle is :" +area);
        }
	 
	public void CircumferenceOfCircle(float radius) {
		
		circumference = 2*3.14*radius;
		System.out.println("circumference of circle is :" +circumference);
	}
	
	//constructor
	public Circle (float radius) {
		diameter = 2*radius;
		System.out.println("diameter of circle is :" +diameter);
		
	}
	
	
	
	

}
