import java.util.*;
public class Evenodd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int n = in.nextInt();
        if (n > 20 && n < 30) {
            if (n % 2 == 0) {
                System.out.println("Jerry");
            } else {
                System.out.println("Tom");
            }
        }
        else{
            System.out.println("input is out of bounds");
        }
    }
}
