package ptacticeJava3;

class Student implements Comparable<Student>{

	 

	 private int rollNumber;

	  private String name;

	  private int age;

	 

	  public Student(int rollNumber,String name,int age)

	  {

	    this.rollNumber=rollNumber;

	    this.name=name;

	    this.age=age; 

	  }

	 

	  public void setName(String name){

	    this.name=name;

	  }

	 

	   public void setAge(int age){

	    this.age=age;

	  }

	 

	  public String getName(){

	    return name;

	  }

	   public int getAge(){

	     return age;

	  }

	   public void setrollNumber(int rollNumber){

	     this.rollNumber=rollNumber;

	  }

	   public int getrollNumber(){

	     return rollNumber;

	   }

	 

	   

	  public int compareTo(Student student)

	  {

	   return this.rollNumber - student.rollNumber;

	    }

	}