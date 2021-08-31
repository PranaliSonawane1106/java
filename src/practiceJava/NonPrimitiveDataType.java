package practiceJava;

public class NonPrimitiveDataType {
	public static void main (String args[])
	{
		String str ="Test 1";
		System.out.println("String is :" + str);
		
		String str1 = new String("Test 2");
		System.out.println("Another String :"+str1);
		
		int arr[];
		arr= new int[3];
		arr[0]=89;
		arr[1]=1;
		arr[2]=2;
		System.out.println(arr);
		System.out.println(arr[2]);
		System.out.println(arr[0]);
	}
}

