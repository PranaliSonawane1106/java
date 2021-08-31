package practiceJava2;

class Emp{

	  int eid;

	  int salary;

	  static String ceo;

	  public void show(){

	  System.out.println("EID :"+eid +", Salary : " +salary +", CEO :" + ceo);

	}

	  static///load a class

	  {

	    ceo="Larry";

	    System.out.println("IN static");

	  }


	  public Emp(){ ///when you create an object

	  eid=1;

	    salary=5000;

	    System.out.println("IN Constructor");

	              }

	}

	 

	 

	public class StaticDemo {

	  static int i;

	  public static void main(String[] args) {

	    i=0;

	    Emp navin =new Emp();

	    //navin.eid=8;

	    //navin.salary=8000;

	              //Emp.ceo="Navin";

	   

	    Emp rahul = new Emp();

	//   rahul.eid=9;

	   // rahul.salary=87000;

	    //Emp.ceo="Rahul";  ////we dont need object for static

	   

	    rahul.show();

	    navin.show();

	    ///System.out.println("Hello Codiva");

	   

	  }

	}