import java.lang.Math;
class Shape 
{
    	double calculateArea() 
	{
        		return 0.0;
    	}
}
class Circle extends Shape 
{
    	double radius;
    	Circle(double radius) 
	{
        		this.radius = radius;
    	}
    	double calculateArea() 
	{
        		return Math.PI * radius * radius;
    	}
}
class Rectangle extends Shape 
{
    	double length;
    	double width;
    	Rectangle(double length, double width) 
	{
        		this.length = length;
       		this.width = width;
    	}
    	double calculateArea() 
	{
        		return length * width;
    	}
}
class Triangle extends Shape 
	{
    		double base;
    		double height;
    		Triangle(double base, double height) 
		{
        			this.base = base;
        			this.height = height;
    		}
    			double calculateArea() 
		{
        			return 0.5 * base * height;
   		 }
	}

public class Subclasses
{
    	public static void main(String[] args) 
	{
        		Circle circle = new Circle(5);
        		Rectangle rectangle = new Rectangle(4, 6);
        		Triangle triangle = new Triangle(3, 4);
        		System.out.println("Area of Circle: " + circle.calculateArea());
        		System.out.println("Area of Rectangle: " + rectangle.calculateArea());
        		System.out.println("Area of Triangle: " + triangle.calculateArea());
    	}
}
