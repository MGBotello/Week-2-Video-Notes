package week2Videos;

public class Conditionals {

	public static void main(String[] args) {
		
		// ******** if  ********
		
		// format: if (boolean comparison) followed by {code to be run if boolean statement is true}
		
		String name = "Sam";
		String name2 = "Tom";
		String name3 = "Alex";		
		if (name  == "Sam") {
			System.out.println("Hello Sam!");//statement after if is true so code will run
		}
		if ( name2 == "Tom") {
			System.out.println("Hello Tom!");//statement after if is true so code will run
		}
		if ( name3 == "Ana") {
			System.out.println("Hello Ana!");// statement after if is false so code will not run/will not print
		}
		
		// ***** else  *****
		// goes after the last curly brace of the "if" statement
		// format : else {code to be run when the "if" statement is false}
		
		System.out.println("**************************");//cosmetic break
		
		String name4 = "Nate";
		
		if ( name4 == "Matt") {
			System.out.println("Hello Matt");
		}else {
			System.out.println("You're not Matt, " + name4);
		
		}
		
		System.out.println("********");
		
		int age = 15;
		
		if (age >= 16) {    // if statement is false, so it will go on to the else statement
			System.out.println("You can get your license!");
		}else {
			System.out.println("Not old enough!");
			System.out.println("Please wait " + (16 - age) + " year(s) to get your license");
		}
		
		// ***** else if *****
		// this statement follows an "if" statement
		// contains an additional boolean expression inside () followed by a code inside {}, 
		//    which will run if the boolean expression if true
		// * the boolean expression in the "else if" evaluates only if the the boolean 
		//     expression in the previous "if" statement is false
		// followed by an "else" statement, which is the default if the previous "if" or "else if" statement(s) are false
		System.out.println("********");
		
		double costOfMilk = 3;
		
		if (costOfMilk <= 2){ //this boolean expression is false, so it will go on to the "else if" statement
			System.out.println("Buying 2");
		}else if (costOfMilk <= 3) {
			System.out.println("Buying 1");
		}else {
			System.out.println(" Not buying any");
		}
		
		// ******* switch ******
		// evaluates a variable, then provide multiple code blocks that could be executed, 
		//    based on the value of the variable
		// format: switch (variable), followed by the blocks of code or case then a "break" before moving on to the next case
		// ending with a default if the previous cases are false
		
		System.out.println("********");
		char grade = 'C';
		
		switch (grade) {  
			case 'A': 
				System.out.println("90%");// without the "break;" it will continue to run the next case even  
				break;                       //if the first one was true
			case 'B':
				System.out.println("80%");
				break;
			case 'C':
				System.out.println("70%");//case A and B are false, so it moves to case C, which is true-> runs code
				break;
			default:
				System.out.println("0%");
		}
		
		
		

	}

}
