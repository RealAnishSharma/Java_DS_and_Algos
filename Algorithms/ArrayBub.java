class ArrayBub{
private long[] a;
private int nElems;
public ArrayBub(int max){
a=new long[max];
nElems=0;
}

public void insert(long value){
	a[nElems]=value;nElems++;
}
public void display(){
	int j;
	for(j=0;j<nElems;j++){System.out.print(a[j]+" ");}
	System.out.println(" ");
}

public void bubbleSort(){
	int in,out;
	for(out=nElems-1;out>1;out--)
		for(in=0;in<out;in++)
			if(a[in]>a[in+1])
				swap(in,in+1);
}
private void swap(int one,int two){
	long temp=a[one];
	a[one]=a[two];
	a[two]=temp;
}
}

`
