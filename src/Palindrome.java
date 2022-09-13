public class Palindrome {
    public static void main(String[] args) {

        String Convert;
        String rev = "";
        int a;


        String word = " Eva, can I see bees in a cave?";
        System.out.println("Words: " + word);
        Convert = word.replaceAll("[^a-zA-Z]","");


        char [] ch = Convert.toCharArray();

        for( a = ch.length - 1; a >= 0; a--)
        {
            rev = rev + ch[a];

        }
        System.out.println("Filterd Reverse Word : " + rev);


        if(rev.equalsIgnoreCase(Convert)) {
            System.out.println("This is palindrome");
        }else {
            System.out.println("This is not palindrome");
        }


    }
}
