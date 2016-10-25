import java.util.*;
public class setDemo{
public static void main(String args[]){
int count[]={34,22,10,60,30,22};
Set<Integer> set=new HashSet<Integer>();
try{
for(int i=0;i<5;i++){
set.add(count[i]);
}
System.out.println(set);
TreeSet sortedSet=new TreeSet<Integer>(set);
System.out.println("Sorted list "+sortedSet);
System.out.print("The last element of the set is "+sortedSet.last());
System.out.print("The first element of the set is "+sortedSet.first());
}catch(Exception e){}
}}