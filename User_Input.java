package week2Videos;

import java.util.Scanner;

public class User_Input {

	public static void main(String[] args) {

		// ******** User Input ******
		
		/*syntax:
	    Scanner (capital S) then give any variable name set = to new Scanner(System.in); *Capital S
		the " Scanner " string will be red(underlined) because Scanner is a 
		variable not declared yet...hover over it and import 
		an import will occur before the " Public class " line
		** the line reads: import java.util.Scanner; **
		*/
		Scanner sc = new Scanner(System.in); // This allows to receive input from the user
		
		//Example 1
		
		System.out.print(" Enter Your Name: ");//sysout command without the "ln" after print
		String name = sc.nextLine(); //command line sc.nextLine() is given a Variable (string) * Capital L
		
		System.out.println("Welcome, " + name);//Print out "welcome" and prints out the name given by the user 
												//in the previous line of code
		//Example 2
		
		System.out.println("Example 2");
		
		System.out.println("Select an option.");  //prints out the menu
		System.out.println("1) add candy bar to shopping cart: 1.99");
		System.out.println("2) add cheese bar to shopping cart: 6.95");
		System.out.println("3) add soccer ball bar to shopping cart: 12.99");
		
		int selection = sc.nextInt(); //the input from the user will be taken as an integer and assigned to the variable "selection"
		double total = 0; //declare variable "total" and is being set to zero, its a double(will have decimals)
		
		switch (selection) {//"selection" is the variable to be evaluated or looked at
		case 1:
			total += 1.99; // += means total + 1.99
			break;
		case 2:
			total += 6.95;
			break;
		case 3:
			total += 12.99;
			break;
		default:// if none of the above cases was chosen by the user, execute the following code(print in this case)
			System.out.println("Please choose a valid option.");
		
		}
		System.out.println("Your total is "+ total);//will let us SEE the updated total after the user's choice
		// The above example only lets us choose one option or case and then the code stops...
		
		// to be able to continue "shopping" and choose other items we have to run the code multiple times. 
		//Which is best done with a loop
		
		//Example 3
		System.out.println("Example 3"); // the previous code will be part of the loop:
		
		int selection2 = 0;// declare the variable before the loop
		double total2 = 0; 
		
		while (selection2 != 4) {//while the input from user is not 4, keep running the loop
			System.out.println("Select an option.");  //prints out the menu
			System.out.println("1) add candy bar to shopping cart: 1.99");
			System.out.println("2) add cheese bar to shopping cart: 6.95");
			System.out.println("3) add soccer ball bar to shopping cart: 12.99");
			System.out.println("4) Check out.");
			
			selection2 = sc.nextInt();//ask for input after the menu prints 
			
			
			switch (selection2) {//"selection2" is the variable to be evaluated or looked at
			case 1:
				total2 += 1.99; // += means total + 1.99
				break;
			case 2:
				total2 += 6.95;
				break;
			case 3:
				total2 += 12.99;
				break;
			case 4://does nothing but also prevents the default from running
				break;
			default:// if none of the above cases was chosen by the user, execute the following code(print in this case)
				System.out.println("Please choose a valid option.");
			
			}
			System.out.println("Your total is "+ total2);
	
}
		
	}

}
