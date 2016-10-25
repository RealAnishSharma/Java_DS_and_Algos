import java.util.*;
public class IteratorDemo{
public static void main(String args[]){
ArrayList a1=new ArrayList();
a1.add("P");
a1.add("f");a1.add("u");a1.add("k");a1.add("n");a1.add("m");

Iterator itr=a1.iterator();
while(itr.hasNext()){
System.out.print(itr.next()+" ");
}
ListIterator litr=a1.listIterator();
while(litr.hasNext()){
litr.set(litr.next()+"+");
}
System.out.println();
itr=a1.iterator();
while(itr.hasNext()){
System.out.print(itr.next()+" ");
}
System.out.println();
while(litr.hasPrevious()){
System.out.print(litr.previous()+" ");
}}}