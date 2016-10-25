class MergeApp{
	public static void main(String args[]){
		int[] arrayA={23,47,81,95};
		int[] arrayB={7,14,39,55,62,74};
		int[] arrayC=new int[10];
		
		merge(arrayA,4,arrayB,6,arrayC);
		display(arrayC,10);	
	}
	
	public static void merge(int[] arrayA,int sizeA,int[] arrayB,int sizeB,int[] arrayC){
		int aDex=0,bDex=0,cDex=0;
		
		while(aDex<sizeA&&bDex<sizeB)
			if(arrayA[aDex]<arrayB[bDex])
				arrayC[cDex++]=arrayA[aDex++];
			else
				arrayC[cDex++]=arrayB[bDex++];
			
			
			while(aDex<sizeA) arrayC[cDex++]=arrayA[aDex++];
			
			while(bDex<sizeB) arrayC[cDex++]=arrayB[bDex++];
	}
	
	
	public static void display(int[] theArray,int size){
		for(int j=0;j<size;j++)
			System.out.print(theArray[j]+" ");
		System.out.println("");
	}
	
	
}