import java.util.*;
public class HashSetDemo{

public static void main(String args[]){

//create a hash set 

HashSet hs = new HashSet();
//Add elements to the hash set 

hs.add("B");
hs.add("java");
hs.add("D");
hs.add("100");
hs.add("C");
hs.add("F");
hs.add("F");
hs.remove("D");

System.out.println(hs);

Iterator it = hs.iterator();

while (it.hasNext()){

System.out.println(it.next());

}

}

}