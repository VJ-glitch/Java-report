import java.util.Scanner;
public class Factorial
{
    public static void main(String[] args) {
        int a,fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number to find factorial : ");
        a=sc.nextInt();
        if(a==0)
        {
            System.out.println("Factorial is 1");
        }
        else
        {
            for(int i=1;i<=a;i++)
            {
                fact*=i;
            }
        }
        System.out.println("Factorial is " +fact);
    }
}
