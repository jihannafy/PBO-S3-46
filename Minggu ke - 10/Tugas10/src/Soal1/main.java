package Soal1;

public class main {

	public static void main( String[] args ) {
		try {
			Thread t = new Thread(new AsyncRun());
			t.start();
			System.out.println( "main on thread " + Thread.currentThread().getId());
			throw new NullPointerException();
			}
		catch(Exception ex)
		{
			System.out.println(ex.getClass().getName() + " handled");
		}
	}
}
