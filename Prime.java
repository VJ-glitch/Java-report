import java.util.Scanner;

public class Prime
{
    public static void main(String[] args)
    {
        int a,i=2,flag=0;
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter number : ");
	a=sc.nextInt();
	if(a==0 || a==1)
	{
		System.out.println("Neither prime nor composite");
   	}
	else
	{
		while(i<a/2)
		{
			if(a%i==0)
			{
				flag=1;
				break;
			}
			i++;
		}
		if(flag==0)
		{
			System.out.println(" Prime number ");
		}
		else
		{
			System.out.println(" Not a prime number " );
		}
	}

    }
}
