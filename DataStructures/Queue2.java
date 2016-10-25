class Queue2{
	private int maxSize;
	private long[] queArray;
	private int front;
	private int rear;
	
	public Queue2(long s){
		maxSize=s;
		queArray=new long[maxSize];
		front=0;rear=-1;
	}
	
	public void insert(long j){
		if(rear==maxSize-1) rear=-1;
		queArray[++rear]=j;
	}
	public long remove(){
		long temp=queArray[front++];
		if(front==maxsize) front=0;
		return temp;
	}
	public long peek(){
		return queArray[front];
	}
	public boolean isEmpty(){
		return (rear==front-1||front +maxSize-2==rear);
	}
	public boolean isFull(){
		return (rear+2==front)
	}
	public int size(){
		if(rear>=front) return rear-front+1;
		else return (maxSize-front)+(rear+1);
	}
}