import java.util.Scanner;

class Sum
{
    public static void main(String arg[])
    {
        int n,sum=0;

        Scanner sc=new Scanner(System.in);

        System.out.println("enter how many numbers you want sum");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println(n);
        for(int i=0;i<n;i++)
        {
            System.out.println("enter "+(i+1)+"th num:");
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            sum+=a[i];
        }
        System.out.println("sum of entered numbers is ="+sum);
    }
} 