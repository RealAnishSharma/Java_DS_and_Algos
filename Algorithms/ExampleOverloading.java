public class ExampleOverloading{
public static void main(String args[]){
int a=11,b=6;double c=0.99,d=34.02;
int e=minFunction(a,b);
double f=minFunction(c,d);
System.out.println(e);
System.out.println(f);
}
public static int minFunction(int a,int b)
{
if(a<=b)
return a;
else 
return b;
}
public static double minFunction(double a,double b)
{
if(a<=b)
return a;
else 
return b;
}}

