class superClass{
int num=20;
public void display(){
System.out.println("Super Class");
}}
public class subClass extends superClass{
int num=10;
public void display(){
System.out.println("Sub Class");
}
public void myMethod(){
subClass sub=new subClass();
sub.display();
super.display();
System.out.println("Value of the variable named num in subclass:"+sub.num);
System.out.println("vlue of the variable named num in superclass:"+super.num);
}

public static void main(String args[]){
subClass obj=new subClass();
obj.myMethod();
}}