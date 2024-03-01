class Animal 
{
    	void eat() 
	{
       	 	System.out.println("Animal is eating...");
    	}
}
class Dog extends Animal 
{
    	void bark() 
	{
        		System.out.println("Dog is barking...");
    	}
}

class Puppy extends Dog 
{
    	void eat() 
	{
        		System.out.println("Puppy is eating...");
    	}
}
public class Multilevel
{
    	public static void main(String[] args) 
	{
        		Puppy myPuppy = new Puppy();
        		myPuppy.eat(); 
        		myPuppy.bark(); 
    	}
}
