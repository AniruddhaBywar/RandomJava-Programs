import java.util.Scanner;
public class Sort_no
{
public static void main(String[] args)
	{
int num;
Scanner sc=new Scanner(System.in);
System.out.print("ENTER ANY NUMBER=====> ");
num=sc.nextInt();
sc.close();
if (num%2==0)
		{System.out.println("THE NUMBER YOU ENTERED IS EVEN");
		}
else
		{System.out.println("THE NUMBER YOU ENTERED IS ODD");
		}
	}
}
