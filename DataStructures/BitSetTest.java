import java.util.BitSet;
public class BitSetTest{
public static void main(String args[]){
int i;
BitSet a=new BitSet(16);
BitSet b=new BitSet(16);
for(i=0;i<16;i++){
if(i%2==0) a.set(i);
if(i%5!=0) b.set(i);
}
System.out.println("A."+a);
System.out.println("B."+b);

//And bits
b.and(a);
System.out.println("add: "+b);
b.or(a);
System.out.println("or: "+b);
b.xor(a);
System.out.println("xor: "+b);
System.out.println(a);
a.flip(3,6);
System.out.println(a);
a.flip(9);
System.out.println(a);
System.out.println(a.length());
a.clear();
System.out.println(a);

}}