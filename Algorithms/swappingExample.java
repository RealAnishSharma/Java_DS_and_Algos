public class swappingExample{
public static void main(String[] args){
int a=30;
int b=23;
System.out.println("a="+a+" b="+b);
swap(a,b);
}
public static void swap(int a,int b){
a=a+b;
b=a-b;
a=a-b;
System.out.println("a="+a+" b"+b);
}}