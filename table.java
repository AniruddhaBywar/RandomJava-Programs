import java.util.Scanner;
public class table{
public static void main(String[] args){
 Scanner scn=new Scanner(System.in);
int n;
int i=0;
System.out.println("Enter the number you want a table of:"); 
n=scn.nextInt();
scn.close();
for(i=0;i<=10;i++)
	{
	int m=n*i;
	System.out.println(n+"X"+i+"="+m);
		}	
}
}
