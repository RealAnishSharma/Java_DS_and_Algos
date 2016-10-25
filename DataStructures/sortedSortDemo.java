import java.util.*;
public class sortedSortDemo{
public static void main(String args[]){
SortedSet set=new TreeSet();
set.add("r");
set.add("n");
set.add("A");
set.add("B");

Iterator itr=set.iterator();
while(itr.hasNext()){
Object element=itr.next();
System.out.println(element.toString());
}
System.out.println(set.first());
System.out.println(set.last());

System.out.println(set.headSet("n"));
}}