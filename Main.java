class Parent
 {
   	 int num = 10;
	void display()
	 {
       		 System.out.println("Parent class method");
   	 }
}
class Child extends Parent
 {
   	 int num = 20;
   	void display() 
	{
       		 super.display();
        		System.out.println("Child class method");
    	}

  	 void printNum() 
	{
       		 System.out.println("Parent num: " + super.num);
        		System.out.println("Child num: " + num);
    	}
}

public class Main 
{
    	public static void main(String[] args) 
	{
        		Child obj = new Child();
        		obj.display(); 
        		obj.printNum(); 
    	}
}
