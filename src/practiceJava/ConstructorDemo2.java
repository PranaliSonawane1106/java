package practiceJava;

public class ConstructorDemo2 {
	int modelYear;
	String modelName;

	public ConstructorDemo2 (int year, String name) {
	  modelYear = year;
	  modelName = name;
	}

	public static void main(String[] args) {
		ConstructorDemo2 myCar = new ConstructorDemo2 (1969, "Mustang");
	  System.out.println(myCar.modelYear + " " + myCar.modelName);
	}
}
