import java.util.*;
public class PropDemo{
public static void main(String args[]){
Properties capitals=new Properties();
Set states;
String str;

capitals.put("Rajasthan","Jaipur");
capitals.put("chhatisgarh","raipur");
capitals.put("ChhotaRajasthan","udaipur");
capitals.put("Bihar","patna");
capitals.put("Rajasthaniya","Jaipuriya");
 
states=capitals.keySet();
System.out.println(states);
Iterator itr=states.iterator();
while(itr.hasNext()){
str=(String) itr.next();
System.out.println("The capital of "+str+" is "+capitals.getProperty(str));
}
System.out.println();
str=capitals.getProperty("Florida","NotFound");
System.out.println("The capital of Florida is "+str);
}}