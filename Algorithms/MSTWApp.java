class Edge{
public int srcVert;
public int destVert;
public int distance;

public Edge(int sv,int dv,int d){
	srcVert=sv;
	destVert=dv;
	distance=d;
}
}

class PriorityQ{
	private final int SIZE=20;
	private Edge[] queArray;
	private int size;
	
	public PriorityQ(){
		queArray=new Edge[SIZE];size=0;
	}
	public void insert(Edge item){
		int j;
		for(j=0;j<size;j++)
			if(item.distance>=queArray[j].distance) break;
		for(int k=size-1;k>=j;k--)
                queArray[k+1]=queArray[k];
			
			queArray[j]=item;size++;
	}
	
	public Edge removeMin(){return queArray[--size];}
	public void removeN(int n){
		for(int j=n;j<size-1;j++)
			queArray[j]=queArray[j+1];
		size--;
	}
	
	public Edge peekMin(){return queArray[size-1];}
	public int size(){return size;}
	public boolean isEmpty(){return (size==0);}
	public Edge peekN(int n){return queArray[n];}
	public int find(int findDex){
		for(int j=0;j<size;j++)
			if(queArray[j].destVert==findDex) return j;
		return -1;
	}
	
}

class Vertex{
	public char label;
	public boolean isInTree;
	public Vertex(char lab){label=lab;isInTree=false;}
}

class Graph{
	private final int MAX_VERTS=20;
	private final int INFINITY=1000000;
	private Vertex vertexList[];
	private int adjMat[][];
	private int nVerts;
	private int currentVert;
	private PriorityQ thePQ;
	private int nTree;
	
	
	public Graph(){
		vertexList=new Vertex[MAX_VERTS];
		adjMat=new int[MAX_VERTS][MAX_VERTS];
		nVerts=0;
		
		for(int j=0;j<MAX_VERTS;j++)
		for(int k=0;k<MAX_VERTS;k++)
			adjMat[j][k]=INFINITY;
		thePQ=new PriorityQ();
	}
	
	
	public void addVertex(char lab){vertexList[nVerts++]=new Vertex(lab);}
	public void addEdge(int start,int end,int weight){
		adjMat[start][end]=weight;
		adjMat[end][start]=weight;
	}
	public void displayVertex(int v){System.out.print(vertexList[v].label);}
	
	public void mstw(){
		currentVert=0;
	while(nTree<nVerts-1){
		vertexList[currentVert].isInTree=true;
		nTree++;
		for(int j=0;j<nVerts;j++){
			if(j==currentVert) continue;
			if(vertexList[j].isInTree) continue;
			int distance=adjMat[currentVert][j];
			if(distance==INFINITY) continue;
			putInPQ(j,distance);
		}
		
		if(thePQ.size()==0){System.out.println("GRAPH NOT CONNECTED");return;}
		Edge theEdge=thePQ.removeMin();
		int sourceVert=theEdge.srcVert;
		currentVert=theEdge.destVert;
		
		System.out.print(vertexList[sourceVert].label);
		System.out.print(vertexList[currentVert].label);
	    System.out.print(" ");
	}
	for(int j=0;j<nVerts;j++) vertexList[j].isInTree=false;
	}
	
	public void putInPQ(int newVert,int newDist){
		int queueIndex=thePQ.find(newVert);
		if(queueIndex!=-1){
			Edge tempEdge=thePQ.peekN(queueIndex);
			int oldDist=tempEdge.distance;
			if(oldDist>newDist){
				thePQ.removeN(queueIndex);
				Edge theEdge=new Edge(currentVert,newVert,newDist);
				thePQ.insert(theEdge);
				}
		}
		else {
			Edge theEdge=new Edge(currentVert,newVert,newDist);
			thePQ.insert(theEdge);
		}
	}
}



class MSTWApp{
	public static void main(String args[]){
		Graph theGraph=new Graph();
		theGraph.addVertex('A');theGraph.addVertex('B');theGraph.addVertex('C');theGraph.addVertex('D');theGraph.addVertex('E');theGraph.addVertex('F');
		theGraph.addEdge(0,1,6);theGraph.addEdge(0,3,4);theGraph.addEdge(1,2,10);theGraph.addEdge(1,3,7);theGraph.addEdge(1,4,7);theGraph.addEdge(2,3,8);
		theGraph.addEdge(2,4,5);theGraph.addEdge(2,5,6);theGraph.addEdge(3,4,12);theGraph.addEdge(4,5,7);
		
		System.out.print("MINIMUM SPANNING TREE");
		theGraph.mstw();
		System.out.println();
	}
}