package practiceJava;
public class OperatorPractice1 {
	public static void main(String arg[]) {

			    int a = 12, b = 5;
			   
			    // addition operator
			    System.out.println("a + b = " + (a + b));

			    // subtraction operator
			    System.out.println("a - b = " + (a - b));

			    // multiplication operator
			    System.out.println("a * b = " + (a * b));

			    // division operator
			    System.out.println("a / b = " + (a / b));

			    // modulo operator
			    System.out.println("a % b = " + (a % b));
			    /////////////////////////////////////////////////////
			    ////  Relational Operators  ////
			    // value of a and b
			    System.out.println("a is " + a + " and b is " + b);

			    // == operator
			    System.out.println(a == b);  // false

			    // != operator
			    System.out.println(a != b);  // true

			    // > operator
			    System.out.println(a > b);  // false

			    // < operator
			    System.out.println(a < b);  // true

			    // >= operator
			    System.out.println(a >= b);  // false

			    // <= operator
			    System.out.println(a <= b);  // true
			    /////////////////////////////////////////
			    /////  Logical Operators   /////
			   // && operator
			    System.out.println((5 > 3) && (8 > 5));  // true
			    System.out.println((5 > 3) && (8 < 5));  // false

			    // || operator
			    System.out.println((5 < 3) || (8 > 5));  // true
			   /// System.out.println((5 > 3) || (8 < 5));  // true
			    System.out.println((5 < 3) || (8 < 5));  // false

			    // ! operator
			    System.out.println(!(5 == 3));  // true
			    System.out.println(!(5 > 3));  // false
				
	}
}
