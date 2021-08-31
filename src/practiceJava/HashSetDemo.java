package practiceJava;
import java.util.*;

class HashSetDemo {

 

  public static void main(String[] args) {

   

   HashSet<String>hashSet = new HashSet<String>();

    hashSet.add("A");

    ///    System.out.println(list);

    hashSet.add("B");

       ///System.out.println(list);

    hashSet.add("C");

       /// System.out.println(list);

   hashSet.add("C");

    System.out.println(hashSet); 

    

    System.out.println("List Contain C or not ?"+ hashSet.contains("C") );

  }

}