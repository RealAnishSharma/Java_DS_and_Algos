import java.util.*;

public class TreeMapDemo{
public static void main(String args[]){
TreeMap hm=new TreeMap();
hm.put("Lalit", new Double(999.33));
hm.put("Geeta",new Double(777.67));
hm.put("Johar", new Double(666.88));
hm.put("Haroon", new Double(222.09));

Set set=hm.entrySet();
Iterator i=set.iterator();
while(i.hasNext()){
Map.Entry me=(Map.Entry)i.next();
System.out.print(me.getKey()+":");
System.out.println(me.getValue());

}
System.out.println();
double balance=((Double)hm.get("Johar")).doubleValue();
hm.put("Johar",new Double(balance+1200));
System.out.println("Johar's new balance:"+hm.get("Johar"));
}}