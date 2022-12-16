import java.util.Arrays.*;
import java.util.regex.*;
import java.util.Scanner;
import java.lang.Exception;

public class App {

    public static void main(String[] args) {
    	while(true){
    		 Scanner scane = new Scanner(System.in);

        String dt = "<data_type";
        String id = "<identifier";
        String ao = "<assignment_operator";
        String val = "<value";
        String del = "<delimiter";
        try{
        
        System.out.print("Enter Token: ");
        String str = scane.nextLine();
        String[] arrofStr = str.split(">");


        if(arrofStr[0].matches(dt)){
             // data types
            if(arrofStr[1].matches(id)){
                 // identifier
                if(arrofStr[2].matches(ao)){
                     //Assign operator
                    if(arrofStr[3].matches(val)){
                         // Value
                        if(arrofStr[4].matches(del)){
                            System.out.println("Syntax is Correct!");
                        }
                        else{
                            System.out.println("Syntax is incorrect!");
                            System.out.println("<data_type> <identifier> <assignment_operator> <value> <delimiter>");
                        } 
                    }
                    else{
                        System.out.println("Syntax is incorrect!");
                        System.out.println("<data_type> <identifier> <assignment_operator> <value> <delimiter>");
                    }
                }
                else{
                    System.out.println("Syntax is incorrect!");
                    System.out.println("<data_type> <identifier> <assignment_operator> <value> <delimiter>");
                }
            }
            }
            else{
                System.out.println("Syntax is incorrect!");
                System.out.println("<data_type> <identifier> <assignment_operator> <value> <delimiter>");
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Syntax is incorrect!");
            System.out.println("<data_type> <identifier> <assignment_operator> <value> <delimiter>");
    }
        System.out.println();
    	}
    	
    }
}
