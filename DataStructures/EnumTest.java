import java.util.Enumeration;
import java.util.Vector;
public class EnumTest{
public static void main(String args[]){
Vector dayNames=new Vector();
Enumeration days;
dayNames.add("Monday");
dayNames.add("Tuesday");
dayNames.add("Wednesday");
dayNames.add("Thursday");
dayNames.add("Friday");
dayNames.add("Saturday");
dayNames.add("Sunday");
days=dayNames.elements();
while(days.hasMoreElements())
{System.out.println(days.nextElement());}
}}