package practiceJava2;
import java.util.HashMap;

import java.util.Map;

import java.util.Map.Entry;

 

class HashMapDemo {

 

  public static void main(String[] args) {

   

    Map<String, Integer> map = new HashMap<>();

   

    map.put("a", 10);

    map.put("b",20);

    map.put("c",30);

   

    //System.out.println("Size of Map :"+ map.size());

    //System.out.println(map);

 

  if(map.containsKey("a")){

      Integer a = map.get("a");

     // System.out.println("Value For Key"+"\"a\"is: "+a);

    }

   

    for(String key : map.keySet()){

      System.out.println("Key:"+ key+", Value: "+map.get(key));

     }

    for(Entry<String, Integer> entry : map.entrySet()){

         System.out.println("Key:" + entry.getKey() + ", Value: " + entry.getValue());

     }

  }

}