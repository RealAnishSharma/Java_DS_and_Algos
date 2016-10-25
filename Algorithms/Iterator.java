import java.io.*;
class Link{
public long dData;
public Link next;
public Link(long dd){dData=dd;}
public void displayLink(){System.out.print(dData+" ");}
}

class LinkList{
	private Link first;
	public LinkList(){first=null;}
	public Link getFirst(){return first;}
	public void setFirst(Link f){first=f;}
	public boolean isEmpty(){return first==null;}
	public ListIterator getIterator(){return new ListIterator(this);}
	public void displayList(){
		Link current=first;
		while(current!=null){
			current.displayLink();
			current=current.next;
		}
		System.out.println("");
	}
}

class ListIterator{
	private Link current;
	private Link previous;
	private LinkList ourList;
	
	public ListIterator(LinkList list){
		ourList=list;
		reset();
	}
	
	public void reset(){
		current=ourList.getFirst();
		previous=null;
	}
	
	public boolean atEnd(){return (current.next==null);}
	
	public void nextLink(){
		previous=current;
		current=current.next;
	}
	
	public Link getCurrent(){return current;}
	
	public void insertAfter(long dd){
		Link newLink=new Link(dd);
		if(ourList.isEmpty()){
			ourList.setFirst(newLink);
			current=newLink;
		}
		else{
			newLink.next=current.next;
			current.next=newLink;
			nextLink();
		}
	}
	
	
	public void insertBefore(long dd){
		Link newLink=new Link(dd);
		if(previous==null){
			newLink.next=ourList.getFirst();
			ourList.setFirst(newLink);
			reset();
		}
	    else{
			newLink.next=previous.next;
			previous.next=newLink;
			current=newLink;
		}
	}
	
	public long deleteCurrent(){
		long value=current.dData;
		if(previous==null){ourList.setFirst(current.next);reset();}
		else{
			previous.next=current.next;
			if(atEnd()) reset();
			else
				current=current.next;
		}
		return value;
	}
}


class InterIterApp{
	public static void main(String[] args) throws IOException{
		LinkList theList=new LinkList();
		ListIterator iter1=theList.getIterator();
		long value;
		
		iter1.insertAfter(20);
		iter1.insertAfter(40);
		iter1.insertAfter(80);
		iter1.insertAfter(60);
		
		while(true){
			System.out.print("Enter first letter of show,reset,next,get,before,after,delete: ");
			System.out.flush();
			int choice=getChar();
			switch(choice){
				case 's':
				if(!theList.isEmpty()) theList.displayList();
				else {System.out.println("List is Empty");}
				break;
				case 'r':
				iter1.reset();
				break;
				case 'n':
				if(!theList.isEmpty()&&!iter1.atEnd()) iter1.nextLink();
				else System.out.println("Cant go to next link");
				break;
				case 'g':
				if(!theList.isEmpty()){
					value=iter1.getCurrent().dData;
					System.out.println("Returned "+value);
				}
				else
					System.out.println("List is empty");
				break;
				case 'b':
				System.out.print("Enter value to insert");
				System.out.flush();
				value=getInt();
				iter1.insertBefore(value);
				break;
				case 'a':
				System.out.print("Enter value to insert: ");
				System.out.flush();
				value=getInt();
				iter1.insertBefore(value);
				break;
				case 'd':
				if(!theList.isEmpty()){
					value=iter1.deleteCurrent();
					System.out.println("Deleted "+value);
				}
				else{
					System.out.println("cant delete");
					break;
				}
				default:
				System.out.println("Invalid entry");
				
			}
		}
	}
	
	public static String getString() throws IOException{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		String s=br.readLine();
		return s;
	}
	
	public static char getChar() throws IOException{
		String s=getString();
		return s.charAt(0);
	}
	
	public static int getInt() throws IOException{
		String s=getString();
		return Integer.parseInt(s);
	}
}












