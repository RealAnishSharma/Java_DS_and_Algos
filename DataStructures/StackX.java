import java.util.*;
class StackX{
	private int maxsize;
	private long[] stackArray;
	private int top;
	
	public StackX(int s){
		maxsize=s;
		stackArray=new long[maxsize];
		top=-1;
	}
	public void push(long j){stackArray[++top]=j;}
	public long pop(){return stackArray[top--];}
	public long peep(){return stackArray[top];}
	public boolean isEmpty(){return (top==-1);}
	public boolean isFull(){return (top==maxsize-1);}
}

class StackMap{
public static void main(String args[]){
StackX theStack=new StackX(10);
theStack.push(20);theStack.push(40);theStack.push(60);theStack.push(80);
Scanner scn=new Scanner(System.in);
int n=scn.nextInt();
theStack.push(n);

while(!theStack.isEmpty()){
	long value=theStack.pop();
	System.out.print(value);
	System.out.println(" ");
	
}
System.out.println("");
}
}