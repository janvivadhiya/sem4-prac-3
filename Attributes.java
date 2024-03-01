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
    	double width;
    	double height;
    	Rectangle(double width, double height) 
	{
        		this.width = width;
        		this.height = height;
    	}
    	double calculateArea() 
	{
        		return width * height;
    	}
    	double calculatePerimeter() 
	{
        		return 2 * (width + height);
    	}
}
class Triangle extends Shape 
{
    	double base;
    	double height;
    	double side1;
    	double side2;
    	double side3;
    	Triangle(double base, double height, double side1, double side2, double side3) 
	{
        		this.base = base;
        		this.height = height;
        		this.side1 = side1;
        		this.side2 = side2;
        		this.side3 = side3;
    	}	
    	double calculateArea() 
	{
        		return 0.5 * base * height;
    	}
    	double calculatePerimeter() 
	{
        		return side1 + side2 + side3;
    	}
}
public class Attributes
{
    	public static void main(String[] args) 
	{
        	Circle circle = new Circle(5);
        	Rectangle rectangle = new Rectangle(4, 6);
        	Triangle triangle = new Triangle(3, 4, 5, 4, 3);
        	System.out.println("Area of Circle: " + circle.calculateArea());
        	System.out.println("Area of Rectangle: " + rectangle.calculateArea());
        	System.out.println("Area of Triangle: " + triangle.calculateArea());
    	}
}
