import java.util.*;
public class HashTableDemo{
public static void main(String args[]){
Hashtable balance=new Hashtable();
Enumeration names;
String str;
double bal;

balance.put("Zara",new Double(3434.34));
balance.put("Zaraz",new Double(343.34));
balance.put("Zarax",new Double(344.34));
balance.put("Zarav",new Double(334.34));
balance.put("Thopbay",new Double(899.98));
//show balances in their accounts
names=balance.keys();
while(names.hasMoreElements()){
str=(String) names.nextElement();
System.out.println(str+":"+balance.get(str));
}
System.out.println();
//Deposit balances in their accounts
bal=((Double)balance.get("Zarax")).doubleValue();
balance.put("Zarax",new Double(bal+1000));
System.out.println("Zarax's new balance: "+balance.get("Zarax"));
}}
