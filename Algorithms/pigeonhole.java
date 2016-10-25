import java.io.*;
class pigeonhole{
	public static void main(String args[]) throws IOException{
		int T=getInt();
		int m=1;
		while(T>0){
			T--;
			int n=getInt();
			int level;
			if(n<3) level=0;
			else{
				int sum=0,k=3,count=0;
				while(sum!=n){
					sum=sum+k;
					k=k+2;
					count++;
				}
			 level=count;	
			}
			System.out.println("case "+m+":"+level);m++;
		}
	}


public static int getInt() throws IOException{
	String s=getString();
	return Integer.parseInt(s);
}

public static String getString() throws IOException{
	InputStreamReader isr=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(isr);
    String s=br.readLine();
	return s;
}
}