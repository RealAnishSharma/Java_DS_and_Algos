import java.util.*;
public class MaximumTest{
public static <T extends Comparable<T>>T maximum(T x,T y,T z){
T max=x;
if(y.compareTo(max)>0){max=y;}
if(z.compareTo(max)>0){max=z;}
return max;
}public static void main(String args[]){
System.out.printf("Max of %d,%d and %d is %d\n\n",12,24,3,maximum(12,24,3));
System.out.printf("Max of %f,%f and %f is %f\n\n",.12,2.4,3.9,maximum(.12,3.9,2.4));
System.out.printf("Max of %s,%s and %s is %s\n\n","zamun","sovx","zila",maximum("zamun","sovx","zila"));
}}