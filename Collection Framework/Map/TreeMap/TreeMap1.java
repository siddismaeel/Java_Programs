//author: Ismaeel Siddiqui

import java.util.*;

class TreeMap1
{
public static void main(String[] args)
{
TreeMap tm = new TreeMap(new MyComparator());

tm.put("aaa", 100);
tm.put("bbb",103);
tm.put("ccc",101);
tm.put("ddd",104);

System.out.println(tm);


}

}

class MyComparator implements Comparator
{

public int compare(Object ob1, Object ob2)
{

String s1 = ob1.toString();
String s2 = ob2.toString();

return s2.compareTo(s1);

}

}