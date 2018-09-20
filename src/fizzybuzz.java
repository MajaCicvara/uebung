
public class fizzybuzz 
{

	public static void main(String[] args) 
	{
	
		for(int i = 1; i<=100; i++)
		{
			if(i%3==0)
			{
				System.out.print("Fis!/Fizz!");
				
			if(i%5==0)
			{
				System.out.print("Bass!/Buzz!");
			}
			}
			else
			{
			if(i%5==0)
			{
				System.out.print("Bass!");
			}
			else
			{
				System.out.println(i);
			}
			}
		}

	}

}
