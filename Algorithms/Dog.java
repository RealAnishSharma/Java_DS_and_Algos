class Animal{}
class mammal extends Animal{}
class reptile extends Animal{}
public class Dog extends mammal{
public static void main(String args[]){
Dog shera=new Dog();
System.out.println(shera instanceof Animal);
System.out.println(shera instanceof mammal);
System.out.println(shera instanceof reptile);
}}