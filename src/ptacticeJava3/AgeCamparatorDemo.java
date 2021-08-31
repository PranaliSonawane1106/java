package ptacticeJava3;


import java.util.Comparator;

class AgeCamparatorDemo implements Comparator<Student>

{

  public int compare(Student student1,Student student2)

  {

  if (student1.getAge() < student2.getAge() ){

  return -1;

  }

 

  if (student1.getAge() > student2.getAge() ){

  return 1;

  }

  else {

  return 0;

  }

  }

  

  

    

  }