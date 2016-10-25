import java.util.*;
public class TreeSetDemo{
public static void main(String args[]){
TreeSet hs=new TreeSet();
Set ss=new HashSet();
ss.add("a");ss.add("b");
hs.add("A");
hs.add("G");
hs.add("v");
hs.add("F");
hs.add("f");
hs.addAll(ss);
System.out.println(hs);
hs.remove("v");
System.out.println(hs);

System.out.println(hs.contains("G"));
System.out.println(hs.contains("l"));
System.out.print("\t"+hs.last());
}}