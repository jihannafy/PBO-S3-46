package Soal3;

public class divide {
	public static void main (String args[]) 
	{
		try 
		{
			int d = 0;
			int a = 5 / d;
			System.out.println("hasil : " + a);
		}
		catch (ArithmeticException e) 
		{
			System.out.println(e);
			
		}
	}

}
