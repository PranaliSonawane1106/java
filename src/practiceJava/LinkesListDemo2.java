package practiceJava;
import java.util.LinkedList;
public class LinkesListDemo2 {



  public static void main(String[] args) {

   

    ///System.out.println("Pranali Sonawane");

    LinkedList<String>list =new LinkedList<String>();

    list.add("A");

    ///    System.out.println(list);

    list.add("B");

       ///System.out.println(list);

    list.addLast("C");

       /// System.out.println(list);

    list.addFirst("D");

    ///System.out.println(list);

   

    list.remove(3);

        System.out.println(list);

    list.removeFirst();

     System.out.println(list);

  }

}

 