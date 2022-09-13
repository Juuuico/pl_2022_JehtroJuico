import java.util.Scanner;
public class ImproveDFA {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        String num;
        String state = "q0";


        System.out.print("Enter Number : ");
        num = input.nextLine();

        for(int x = 0; x< num.length();x++) {

            if( state.equals("q0") &&  num.charAt(x) == '1') {
                state = "q0";
            }else if(state.equals("q0") &&  num.charAt(x) == '0') {
                state = "q1";
            }else if(state.equals("q1") &&  num.charAt(x) == '0') {
                state = "q1";
            }else if(state.equals("q1") &&  num.charAt(x) == '1') {
                state = "q2";

            }else if(state.equals("q2") &&  num.charAt(x) == '0') {
                state = "q1";
            }else if(state.equals("q2") &&  num.charAt(x) == '1') {
                state = "q0";
            }
        }
        if(state.equals("q2")){
            System.out.println("String accepted");
        }else{
            System.out.println("String not accepted");
        }
    }
}
