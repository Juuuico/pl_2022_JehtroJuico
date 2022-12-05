import java.util.Scanner;
import java.util.Scanner;
public class Act3 {
    public static void main(String[] args) {

	// isAlpha checks if character is a letter.
	public static boolean isAlpha(char c) {
	// 'A' <= c <= 'Z' or 'a' <= c <= 'z'
		return (c >= 'A' && c  <= 'Z') || (c  >='a' && c <= 'z');
	}
	// isNumber checks if character is a number.
	public static boolean isNumber(char c) {
	// '0' <= c <= '9'
		return (c  >= '0' && c  <= '9');
	}


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("enter : ");
		String input = sc.nextLine();
		
		
		boolean checker = false;     
		for(int x = 0 ; x < input.length(); x++){
			
			String temp = "";
			// 1. Collect all the letters.
		  
			if (input.charAt(x) == '\"' ) {
				x++;
				while (input.charAt(x) != '\"' ){
					x++;
				}
			if(input.charAt(x) == '\'') {
				x++;
				while (input.charAt(x) != '\'' ){
					x++;
				}
				
				}	
			}
			
			String check = "";
			// 2. Is the character a letter or a number?
			if (isAlpha(input.charAt(x)) || isNumber(input.charAt(x))) {
							// 2.1. Collect all the letters
				while (isAlpha(input.charAt(x)) || isNumber(input.charAt(x))) {
					temp += input.charAt(x) + "";
					x++;
				}
				// 2.2. is this a data type?
				if(temp.equals("int") || temp.equals("String") || temp.equals("char") || temp.equals("double") ) {
					// 2.2.1. print <data_type>
					System.out.print("<data_type>");
					
					continue;
					
				}
							
				if (checker) {
					System.out.print("<value>");
					
				} else {
					// if it's identifier, meaning the next is always value.
					checker = true;
					System.out.print("<identifier>");
		
				}
					// there's no continue.
			}
			// 3. is this a assignment operator?
			if (input.charAt(x) == '=') {
				System.out.print("<assignment_operator>");
				
				continue; 
			} 
			
			// 4. is this a delimiter?
			if (input.charAt(x) == ';') {
				System.out.print("<delimiter>");
				
			} 
			
		}
		
	}
    }

