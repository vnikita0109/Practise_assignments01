import java.io.*;

class Iteration{

    public static void main (String[] args) {
        int n ,i,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Input number for printing iteration");
        n=sc.nextInt();

        for(temp=1;temp<=n;temp++)
        {
            for(i=1;i<=temp;i++)
            {
                System.out.println(i);
            }
        }

    }
} 