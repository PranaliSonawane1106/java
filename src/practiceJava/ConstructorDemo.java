package practiceJava;

public class ConstructorDemo {
	int x=50;
	public ConstructorDemo(int y)
	{
	 x = y;	
	}
	public static void main(String arg[])
	{
		ConstructorDemo myobj = new ConstructorDemo(60);
		System.out.println(" x = "+ myobj.x);
	}

}
