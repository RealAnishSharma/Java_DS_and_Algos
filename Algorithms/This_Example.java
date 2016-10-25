public class This_Example{
int num=10;
This_Example(){
System.out.println("This_Example");
}
This_Example(int num){
this();
this.num=num;
}
public void print(){
int num=90;
System.out.println("local"+num);
System.out.println("instance"+this.num);
}
public static void main(String[] args){
This_Example obj1=new This_Example();
obj1.print();
This_Example obj2=new This_Example(34);
obj2.print();
}}