import java.util.Scanner;
public class CheckVC{
    public static void main(String[] args) {

        String str = "Hi";

        if(str!=null) {
            // to reduce the comparisons
            str = str.toLowerCase();

            for (int i = 0; i < str.length(); i++) {

                if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                    System.out.println("Vowel");
                }

                else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {

                    System.out.println("Consonent");
                }
            }
        }
        else
        {
            System.out.println("what is that???");
        }
    }
}