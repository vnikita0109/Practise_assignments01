public class Palindrome {

        public static void main(String args[]){
            int r,sum=0,temp;
            int n,count=0;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the num:");
            n=sc.nextInt();

            temp=n;
            while(n>0){
                r=n%10;
                sum=(sum*10)+r;
                n=n/10;
                if(r%2==0) {
                    count = count + r;
                }
            }
            if(count)
            if(temp==sum)
                System.out.println("palindrome number ");
            else
                System.out.println("not palindrome");

    }
}
