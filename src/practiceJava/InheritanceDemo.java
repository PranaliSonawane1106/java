package practiceJava;
class p{
	public void m1() {
		System.out.println("Parent class");
	}
}
class c extends p {
	public void m2() {
		System.out.println("Child class");
	}
}
public class InheritanceDemo {
	public static void main(String args[]){
        c obj = new c();
        obj.m1();
        obj.m2();
	}
        
}
