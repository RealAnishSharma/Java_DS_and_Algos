class Animal{
public void move(){
System.out.println("Animals can move");
}}
class dog extends Animal{
public void move(){
System.out.println("Dogs can move");
}}

public class OverridingTest{
public static void main(String args[]){
Animal k=new dog();
Animal j=new Animal();
k.move();j.move();
}}