import java.util.Scanner;
public class Addition {
public static void main(String[]args)
{
int a,b,sum;
Scanner scan=new Scanner(System.in);
System.out.println("Enter the first number:");
a=scan.nextInt();
System.out.println("Enter the second number:");
b=scan.nextInt();
scan.close();
sum=a+b;
System.out.println("the sum of the two numbers is: "+sum);
	}
}