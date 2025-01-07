import java.util.Scanner;
class Student 
{
    public String usn,name;
    public int credits[]=new int[8];
    public int marks[]=new int[8];
    public int grades[]=new int[8];
    public void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  details : ");
        System.out.print("Enter your name : ");
        name=sc.nextLine();
        System.out.print("Enter your USN : ");
        usn=sc.nextLine();
        for(int i=0;i<8;i++)
        {
            System.out.print("Enter subject "+(i+1)+" marks : ");
            marks[i]=sc.nextInt();
            System.out.print("Enter subject "+(i+1)+" credits : ");
            credits[i]=sc.nextInt();
            if(marks[i]>=90 && marks[i]<=100)
                {
                    grades[i]=10;
                }
                else if(marks[i]>=80 && marks[i]<90)
                {
                    grades[i]=9;
                }
                else if(marks[i]>=70 && marks[i]<80)
                {
                    grades[i]=8;
                }
                else if(marks[i]>=60 && marks[i]<70)
                {
                    grades[i]=7;
                }
                else if(marks[i]>=50 && marks[i]<60)
                {
                    grades[i]=6;
                }
                else if(marks[i]>=40 && marks[i]<50)
                {
                    grades[i]=5;
                }
                else if(marks[i]>=30 && marks[i]<40)
                {
                    grades[i]=4;
                }
                else if(marks[i]>=20 && marks[i]<30)
                {
                    grades[i]=3;
                }
                else if(marks[i]>=10 && marks[i]<20)
                {
                    grades[i]=2;
                }
                else if(marks[i]>=0 && marks[i]<60)
                {
                    grades[i]=1;
                }
        }

    }
    public int creditssum()
    {
        int sum=0;
        for(int i=0;i<8;i++)
        {
            sum+=credits[i];
        }
        return sum;
    }
    public double sgpa()
    {
        double sgpa=0;
        for(int i=0;i<8;i++)
        {
            sgpa+=credits[i]*grades[i];
        }
        return (sgpa/(creditssum()));  
    }
}

public class Cgpa
{
    public static void main(String[] args) 
    {
       
        Student stud[]= new Student[2];
        for(int i=0;i<2;i++)
        {
            stud[i]=new Student(); //Create object of class Student after each loop
            System.out.println("Enter student "+(i+1) +" semester details");
            stud[i].accept();
        }
        double cgpa=0;
        for(int i=0;i<2;i++)
        {
            cgpa+=stud[i].sgpa();
        }
        System.out.println("CGPA is "+(cgpa/2));
        System.out.println("Sem 1 SGPA : "+stud[0].sgpa()+" Sem 2 SGPA : "+stud[1].sgpa());
    }
}
