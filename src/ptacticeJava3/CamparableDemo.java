package ptacticeJava3;

import java.util.Collections;

import java.util.ArrayList;

class CamparableDemo {

 

  public static void main(String[] args) {

   

    ArrayList<Student>list = new ArrayList <Student>();

   

    Student john = new Student(1,"C",20);

    Student jane = new Student(2,"A",18);

    Student tom = new Student(3,"B",21);

   

    list.add(john);

    list.add(jane);

    list.add(tom);

   

    Collections.sort(list);

   

    System.out.println("Students after Rollno Sorting  :");

    list.forEach(student -> System.out.println(student.getName()));

   

    

    Collections.sort(list,new AgeCamparatorDemo());

   

    System.out.println("Students after Age Sorting :");

    list.forEach(student -> System.out.println(student.getName()));

  }

}