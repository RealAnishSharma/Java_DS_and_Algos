import java.io.*;

public class ArrayException{
public static void main(String args[]){
try{
int a[]=new int[3];
System.out.println("no is"+a[5]);
}catch(ArrayIndexOutOfBoundsException e)
{System.out.println("Exxeption:::"+e);}
System.out.println("Out of block");
}}