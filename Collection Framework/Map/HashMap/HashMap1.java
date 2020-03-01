//author: Ismaeel Siddiqui

import java.util.*;
import java.util.Map.Entry;
class HashMap1
{
public static void main(String[]  args)
{
HashMap m = new HashMap();

m.put("Ram",101);
m.put("Shyam",102);
m.put("Vkas",103);
m.put("Vipin",104);

System.out.println(m);
System.out.println(m.put("Vipin",105));

HashMap duplicate = (HashMap) m.clone();

Set s = m.keySet();
System.out.println(s);

Collection c = m.values();
System.out.println(c);

Set s1 = m.entrySet();

Iterator itr = s1.iterator();

while(itr.hasNext())
{
Map.Entry m1 = (Map.Entry) itr.next();

System.out.println(m1.getKey()+"------"+m1.getValue());

if(m1.getKey().equals("Ram"))
	m1.setValue(1000);

}

System.out.println(m);
System.out.println(duplicate);
System.out.println(m.hashCode()+"-----"+duplicate.hashCode());
}  
  
  
}