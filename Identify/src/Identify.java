class Identify
{
    public static void main(String[] args)
    { char i;
        char input;
        Scanner sc=new Scanner(System.in);
        System.out.println("input here:");
        input=sc.nextChar();

        for(i='A';i<='Z';i++)
        {
            if(input==i){
                System.out.println("Uppercase");
                switch(input){
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U':
                        System.out.println("Vowel");
                        break;
                    default: System.out.println("Consonent");
                    }
            }

            for(i='a';i<='z';i++)
            {
                if(input==i){
                    System.out.println("Lowercase");
                    switch(input){
                        case 'a':
                        case 'e':
                        case 'i':
                        case 'o':
                        case 'u':
                            System.out.println("Vowel"); break;
                        default: System.out.println("Consonent"); break;
                    }}


                for(i='0';i<='9';i++)//check if number
                {
                    if(input==i)
                        System.out.println("Number");
                }

            }

        }}}