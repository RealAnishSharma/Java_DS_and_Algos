class ArrayIns{
	private long[] theArray;
	private int nElems;
	public ArrayIns(int max){
		theArray=new long[max];
		nElems=0;
	}
	public void insert(long value){
		theArray[nElems]=value;
		nElems++;
	}
	public void display(){
		System.out.print("A=");
		for(int j=0;j<nElems;j++)
			System.out.print(theArray[j]+" ");
		System.out.println("");
	}
	public void quicksort(){recQuickSort(0,nElems-1);}
	public void recQuickSort(int left,int right){
		if(right-left<=0) return;
		else{
			long pivot=theArray[right];
			int partition=partitionIt(left,right,pivot);
			recQuickSort(left,partition-1);
			recQuickSort(partition+1,right);
		}
	}
	
	public int partitionIt(int left,int right,long pivot){
		int leftPtr=left-1;
		int rightPtr=right;
		while(true){
			while(leftPtr<right&&theArray[++leftPtr]<pivot);
			while(rightPtr>left&&theArray[--rightPtr]>pivot);
			if(leftPtr>=rightPtr) break;
			else swap(leftPtr,rightPtr);
		}
		swap(leftPtr,right);
		return leftPtr;
	}
	
	public void swap(int dex1,int dex2){
		long temp;
		temp=theArray[dex1];
		theArray[dex1]=theArray[dex2];
		theArray[dex2]=temp;
	}
	
}


class QuickSort1App{
	public static void main(String[] args){
		int maxSize=16;
		ArrayIns arr;
		arr=new ArrayIns(maxSize);
		
		
		for(int j=0;j<maxSize;j++){
			long n=(int)(java.lang.Math.random()*99);
			arr.insert(n);
		}
		
		arr.display();
		arr.quicksort();
		arr.display();
	}
}