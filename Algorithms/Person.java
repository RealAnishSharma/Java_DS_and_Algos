class Person{
	private String lastName;
	private String firstName;
	private int age;
	
	public Person(String last,String first,int a){
		lastName=last;firstName=first;age=a;
	}
	public void displayPerson(){
		System.out.print(" Last name: "+lastName);
		System.out.print(" First name: "+firstName);
		System.out.println(",Age: "+age);
	}
	public String getLast(){
		return lastName;
	}
}

class ClassDataArray{
	private Person[] a;
	private int nElems;
	public ClassDataArray(int max){
		a=new Person[max];nElems=0;
	}
	public Person find(String searchName){
		int j;
		for(j=0;j<nElems;j++)
			if(a[j].getLast().equals(searchName)) break;
		if(j==nElems) return null;
		else return a[j];
	}
	
	public void insert(String last,String first,int age){
		a[nElems]=new Person(last,first,age);nElems++;
	}
	
	public boolean delete(String searchName){
		int j,k;
		for(j=0;j<nElems;j++)
			if(a[j].getLast().equals(searchName)) break;
		if(j==nElems) return false;
		else{
			for(k=j;k<nElems;k++) a[k]=a[k+1];nElems--;return true;
		}
	}
	
	public void displayA(){
		for(int j=0;j<nElems;j++) a[j].displayPerson();
	}
	
}


class ClassDataApp{
	public static void main(String args[]){
		int maxSize=100;
		ClassDataArray arr=new ClassDataArray(maxSize);
		arr.insert("Evans1","PAtty1",24);
		arr.insert("Evans2","PAtty2",22);
		arr.insert("Evans3","PAtty3",20);
		arr.insert("Evans4","PAtty4",26);
		arr.insert("Evans5","PAtty5",28);
		arr.insert("Evans6","PAtty6",29);
		arr.insert("Evans7","PAtty7",27);
		arr.insert("Evans8","PAtty8",23);
		arr.insert("Evans9","PAtty9",21);
		arr.insert("Evans10","PAtty10",25);
		
		arr.displayA();
		
		String searchKey="Stimson";
		Person found;
		found=arr.find(searchKey);
		if(found!=null){
			System.out.println("found ");
			found.displayPerson();
		}
		else
			System.out.println("cant find"+searchKey);
		
		System.out.println("Deleting Evans2,4,6");
		arr.delete("Evans2");
		arr.delete("Evans4");
		arr.delete("Evans6");
		
		arr.displayA();
		
	}
}