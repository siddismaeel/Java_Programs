//author: Ismaeel Siddiqui

import java.util.*;

class LinkedHashMap1
{
public static void main(String[] args)
{
LinkedHashMap hm = new LinkedHashMap();

hm.put(101,"ABC");
hm.put(102,"XYZ");
hm.put(103,"abc");
hm.put(104,"abc");

Iterator itr = hm.keySet().iterator();

while(itr.hasNext())
{

Integer key = (Integer) itr.next();

String value = (String) hm.get(key);

System.out.println(key + "----------"+value);

}

}

}