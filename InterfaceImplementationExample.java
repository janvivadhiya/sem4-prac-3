interface Shape 
{
    double calculateArea();
    double calculatePerimeter();
}

class Circle implements Shape 
{
    private double radius;
    Circle(double radius)
	{
 		this.radius = radius; 
	}
	public double calculateArea() 
	{ 
		return Math.PI * radius * radius; 
	}
	public double calculatePerimeter()
	{
		 return 2 * Math.PI * radius; 
	}
}

public class InterfaceImplementationExample 
{
    	public static void main(String[] args) 
	{
       		 Circle circle = new Circle(5);
        		System.out.println("Area: " + circle.calculateArea());
        		System.out.println("Perimeter: " + circle.calculatePerimeter());
    	}
}
