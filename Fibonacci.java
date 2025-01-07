import java.util.Scanner;

public class Fibonacci
{
    public static void main(String[] args)
    {
        int a,fib1=0,fib2=1,fib3;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a number : ");
	a=sc.nextInt();
	if(a==0)
	{
		System.out.println(" No Fibonacci series!! ");
	}
	else if(a==1)
	{
		System.out.println(" Fibonacci series is : 0");
	}
	
	else
	{
		System.out.print(fib1 + " " + fib2);
		for(int i=3;i<=a;i++)
		{
			fib3=fib1+fib2;
			fib1=fib2;
			fib2=fib3;
			System.out.print(" " +fib3);
		}
			
	}	
    }
}
