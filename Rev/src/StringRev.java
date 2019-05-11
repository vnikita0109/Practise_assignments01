public class StringRev{


    public static void main(String args[]) {

        //quick wasy to reverse String in Java - Use StringBuffer
        String word = "HelloWorld";
        String reverse = new StringBuffer(word).reverse().toString();


    public static String reverse(String source){
        if(source == null || source.isEmpty()){
            return source;
        }
        String reverse = "";
        for(int i = source.length()-1; i>=0; i--){
            reverse = reverse + source.charAt(i);
        }

        return reverse;
    }

}


    Read more: http://www.java67.com/2012/12/how-to-reverse-string-in-java-stringbuffer-stringbuilder.html#ixzz5nSY3eMJD