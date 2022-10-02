import java.util.Scanner;
import java.util.Scanner;
public class Act3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String data_type = "";
        String identifier = "";
        String assignment_operator = "";
        String value = "";
        char delimiter = ' ';

        System.out.print("Enter Source Language: ");
        String[] input = sc.nextLine().split(" ");


        //short input
        int n = input.length;
        if(n == 2) {
            data_type = input[0];
            identifier = input[1].substring(0,input[1].length()-1);
            delimiter = input[1].charAt(input[1].length()-1);

        }
        //long input;
        else if(n == 4) {
            data_type = input[0];
            identifier = input[1];
            assignment_operator = input[2];
            value = input[3].equalsIgnoreCase("string") ? input[3].substring(1,input[3].length()-2)
                    : input[3].substring(0,input[3].length()-1);
            delimiter = input[3].charAt(input[3].length()-1);
        }
        //string with word input
        else  {
            String[] str = new String[n - 3];
            for(int i = 0; i < n-3; i++) {
                str[i] = input[i+3];
            }
            String strVal = String.join(" ", str);
            data_type = input[0];
            identifier = input[1];
            assignment_operator = input[2];
            value = strVal.substring(1,strVal.length()-2);
            delimiter = strVal.charAt(strVal.length()-1);
        }


        System.out.println( data_type+ " <data_type>");
        System.out.println(identifier+ " <identifier> ");
        System.out.println(assignment_operator+ " <assignment_operator>");
        System.out.println(value+ " <value>");
        System.out.println(delimiter+ " <delimiter>");
    }

}

