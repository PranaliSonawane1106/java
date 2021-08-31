package practiceJava;

public class ClassDemo3 {
	
		  // Static method
		  static void myStaticMethod() {
		    System.out.println("Static methods can be called without creating objects");
		  }

		  // Public method
		  public void myPublicMethod() {
		    System.out.println("Public methods must be called by creating objects");
		  }

		  // Main method
		  public static void main(String[] args) {
		    myStaticMethod(); 

		    ClassDemo3 myObj = new ClassDemo3(); 
		    myObj.myPublicMethod(); 
		}
}

