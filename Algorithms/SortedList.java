class Link{
	public long dData;
	public Link next;
	public Link(long dd){dData=dd;}
	public void displayLink(){System.out.print(dData+" ");}	
	}
	
	class SortedList{
		private Link first;
		public SortedList(){first=null;}
		public boolean isEmpty(){return (first==null);}
		public void insert(long key){
			Link newLink=new Link(key);
			Link previous=null;
			Link current=first;
			
			while(current!=null&&key>current.dData){
				previous=current;
				current=current.next;
			}
			if(previous==null) first=newLink;
			else previous.next=newLink;
			newLink.next=current;
		}
		
		public Link remove(){
			Link temp=first;
			first=first.next;
		    return temp;	
		}
	
	
	public void displayList(){
		System.out.print("List(first-->Last):");
		Link current=first;
		while(current!=null){
			current.displayLink();
			current=current.next;
		}
		System.out.println("");
	}
	}
	
	class SortedListApp{
		public static void main(String args[]){
			SortedList theSoretedList=new SortedList();
			theSoretedList.insert(20);
			theSoretedList.insert(40);
			theSoretedList.displayList();
			theSoretedList.insert(10);
			theSoretedList.insert(30);
			theSoretedList.insert(50);
			theSoretedList.displayList();
			theSoretedList.remove();
			theSoretedList.displayList();
		}
	}