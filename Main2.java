class Year
 {
   	 int year;
    	Year(int year) 
	{
        		this.year = year;
    	}
    	boolean isLeapYear() 
	{
        		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) 
		{
            			return true;
       		}
        		return false;
    	}
}

class LeapYear extends Year 
{
    	LeapYear(int year) 
	{
        		super(year);
   	}
    	void display() 
	{
        		if (isLeapYear()) 
		{
            			System.out.println(year + " is a leap year.");
       		} else 
		{
            			System.out.println(year + " is not a leap year.");
        		}
    	}
}
public class Main2 
{
    	public static void main(String[] args) 
	{
        		LeapYear obj = new LeapYear(2024);
        		obj.display();
    	}
}
