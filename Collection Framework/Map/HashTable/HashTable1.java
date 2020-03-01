//author: Ismaeel Siddiqui

import java.util.*;

class HashTable1
{

public static void main(String[] args)
{

Hashtable ht = new Hashtable();


ht.put(new Temp(5), "A");
ht.put(new Temp(2), "B");
ht.put(new Temp(11), "C");
ht.put(new Temp(6), "D");
ht.put(new Temp(23), "E");
ht.put(new Temp(16), "F");
ht.put(new Temp(5), "A");
//ht.put("Deepak", null); only homogeneous objects are allowed 

System.out.println(ht);


}

}

class Temp
{

int i;

public Temp(int i)
{
this.i = i;
}

public int hashCode()
{

return i;
}

public boolean equals(Object ob)
{
Temp t =(Temp) ob;

if(this.i == t.i)
{
return true;

}
else
	
	{
		return false;
	}

}

public String toString()
{
	return hashCode() + "";
	
}


}