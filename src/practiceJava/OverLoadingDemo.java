package practiceJava;

public class OverLoadingDemo {
public void m1() {
	System.out.println("No Arg Method ");
}
public void m1(int i) {
	System.out.println("Int Arg Method ");
}
public void m1(double d) {
	System.out.println("double Arg Method ");
}
public static void main(String[] args) {
	OverLoadingDemo myobj = new OverLoadingDemo();
	myobj.m1();
	myobj.m1(10);
	myobj.m1(9.0);
	myobj.m1('a');
	myobj.m1(8.9);
}
}
