package practiceJava2;

import java.util.TreeMap;

class TreeMapDemo {

  public static void main(String[] args) {

    TreeMap<String,Integer> treeMap = new TreeMap<>();

    treeMap.put("A",3);

    treeMap.put("C",2);

    treeMap.put("B",1);

    System.out.println(treeMap);

  }

}