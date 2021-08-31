package practiceJava;

public class PrimitiveDataType {
	public static void main (String args[])
	{
		char a ='A';
		byte b = 2;
		short c = 22;
		int d = 45;
		float e = 5.76f;
		double f = 5.123456990d;
		boolean g = true;
		
		System.out.println("char    : " + a );
		System.out.println("byte    : " + b );
		System.out.println("short   : " + c );
		System.out.println("int     : " + d );
		System.out.println("float   : " + e );
		System.out.println("double  : " + f );
		System.out.println("boolean : " + g );
		System.out.println("Int represenation : " + d );
		long h =d;
		System.out.println("Long represenation : " + h );
		float i =h;
		System.out.println("Float represenation : " + i );
	}
}
