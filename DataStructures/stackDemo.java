import java.util.*;
public class stackDemo{
public static void showpush(Stack st,int i){
System.out.println("Pushing"+i);
st.push(i);
System.out.println(st);
}
public static void showpop(Stack st){
System.out.println("Lets Pop");
st.pop();
System.out.println(st);
}
public static void main(String args[]){
Stack stk=new Stack();
System.out.println("Stack "+stk);
showpush(stk,42);
showpush(stk,66);
showpush(stk,99);
showpop(stk);
System.out.println("Peep"+stk.peep());
showpop(stk);
showpop(stk);
try{
showpop(stk);
}catch(EmptyStackException e){
System.out.println("EMPTY");
}}}