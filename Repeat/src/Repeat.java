import java.util.Scanner;

public class Repeat {

    public static void main(String[] args)
    {
        String str,x="";
        int j=0,i;
        Scanner sc= new Scanner(System.in);

        System.out.println("enter a number and a word having at least given number of letters:");

        str=sc.nextLine();

        i=sc.nextInt();


        System.out.println(str);
        fun(str,i);

        for (j=1;j<=i;j++)
        {
            System.out.println(x);
        }

    }

    public static String fun(String str, int i)
    {
        String x="";

        x=str.substring(str.length()-i,str.length()-1);

    return x;}
}
