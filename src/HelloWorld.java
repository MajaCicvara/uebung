
public class HelloWorld {

	public static void main(String[] args) 
	{
		int Zahl = 7;
		while(Zahl>1)
		{
		if (Zahl % 2 != 0)
		{
		Zahl = Zahl*3+1;	
		}
		else
		{
		Zahl = Zahl/2;	
		}
		System.out.print(Zahl +", ");
		}
	}

}
