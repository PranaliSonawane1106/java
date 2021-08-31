package MultiThreading;
class P extends Thread{
	///@Override
	public void fun() {
	try {
			for(int i=1;i<=5;i++)
			{
				System.out.println("Pranali");
				Thread.sleep(1000);
			}
		}
	catch(InterruptedException i)
	{
				
	
	}
		}
}
class c 
{
 public static void main(String arg[] ) throws InterruptedException
 {
	 P t = new P();
	 t.fun();
	 for(int i=1;i<=5;i++)
		{
			System.out.println("HITESH");
			Thread.sleep(1000);
		}
	 }
}
