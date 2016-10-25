class Person{
private String lastName;
private String firstName;
private int age;
public Person(String last,String first,int age){
lastName=last;firstName=first;this.age=age;}
public void displayPerson(){
System.out.print(" LastName: "+lastName);
System.out.print(" FirstName: "+firstName);
System.out.println(",Age: "+age);}

public String getLast(){
	return lastName;
}
}

class ArrayInOb{
	private Person[] a;
	private int nElems;
	public ArrayInOb(int max){
		a=new Person[max];nElems=0;
	}
	
	public void insert(String last,String first,int age){
		a[nElems]=new Person(last,first,age);nElems++;
	}
	
	public void display(){
		int j;
		for(j=0;j<nElems;j++)
			a[j].displayPerson();
		System.out.println("");
	}
	
	public void insertionSort(){
		int in,out;
		for(out=1;out<nElems;out++){
			Person temp=a[out];
			in=out;
			while(in>0 && a[in-1].getLast().compareTo(temp.getLast())>0){
				a[in]=a[in-1];
				--in;
			}
			a[in]=temp;
		}
	}
}
	class ObjectSortApp{
		public static void main(String args[]){
			int maxSize=100;
			ArrayInOb arr;
			arr=new ArrayInOb(maxSize);
			
			arr.insert("pvans1","Patty1",24);
			arr.insert("Evans2","Patty2",29);
			arr.insert("Svans3","Patty3",28);
			arr.insert("Evans4","Patty4",23);
			arr.insert("Yvans5","Patty5",22);
			arr.insert("Evans6","Patty6",21);
			arr.insert("Evans3","Patty7",20);
			arr.insert("Evans8","Patty8",26);
			arr.insert("Hvans9","Patty9",27);
			
			System.out.println("Before sorting:");
			arr.display();
			arr.insertionSort();
			
			System.out.println("After sorting");
			arr.display();
		}
	}
