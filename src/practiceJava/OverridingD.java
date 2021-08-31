package practiceJava;


class PC{
	public  void property() {
		System.out.println("Gold ,land etc");
	}
	public void Marry() {
		System.out.println("subbakukmi");
	}
	
}

class CC extends PC{
	public void Marry() {
		System.out.println("katrina");
	}
}
public class OverridingD {
	public static void main(String[] args) {
		PC p = new PC();
		p.Marry();
		
		CC c = new CC();
		c.Marry();
		
		PC p1 = new CC();
		p1.Marry();
		
		
}
}