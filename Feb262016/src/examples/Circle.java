package examples;

public class Circle {
	
	private double radius; // attribute defined here
	public static int count = 0;
	
	
	public Circle(double radius){
		
		this.radius = Math.abs(radius);
		
	}
	
	public Circle(){
		
		radius = 1;
	}
	
	
	
	public double getRadius(){
		
		return radius;
	}
	
	public void setRadius(double radius){
		
		this.radius = Math.abs(radius);
	}
	
	
	public double area(){
		
		return Math.PI * radius * radius;
	}
	
	public double circumference(){
		
		return 2 * Math.PI * radius;
	}
	/*
	public static void printRadius(){
		
		System.out.println("Radius " + radius);
	}
	*/
	
	
	

}
