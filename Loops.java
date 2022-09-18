package week2Videos;

public class Loops {

	public static void main(String[] args) {
		
		// **** Loops ***
		// different types of loops in Java
		// One of those loops is the "for" loop
		
		// ******** for loop *******
		
		/* FORMAT: for (1;2;3){code to be run} 
		 * 3 pieces of information go inside the parenthesis
		 * 1) initialize variable 
		 * 2) condition,it will be a boolean, iterate/run the code until that condition is not true
		 * 3) post-iteration or variable increment  (i++, means increase i by one after the iteration
		 * i++ = i+=1 or i = i + 1 (" i " is a variable, it can be something else a,b,c, etc.
		 * then {} curly braces, which is the code to be executed for every iteration until the condition is false
		 */
		// Example 1: Print 1 thru 10
		
		for (int i = 1; i <= 10; i++) {   // variable "i" initiated at 1, iterate until condition is false, then
			System.out.println(i);		  // ...increase "i" by one after each iteration
		}
		System.out.println("Example 2");//Cosmetic break
		
		// Example 2: print even numbers only
		for (int a = 0; a < 10; a += 2) {
			System.out.println(a);
		}
		System.out.println("Example 3");
		
		//Example 3: print even numbers logically
		// " % " = called MOD 
		// if a number is divided by 2 with remainder 0, its an even number
		
		for (int b = 0; b < 10; b++) { 
			if (b % 2 == 0) { // if "b" divided by 2 has remainder of 0, then run the code
				System.out.println(b);
			}
		}
		
		// ******** while loop *******
		
		/*
		FORMAT:
		initiate a variable
		while(boolean expression) *only the condition goes inside the parenthesis
		***** make sure the loop can exit. the exit will be when the condition(boolean expression) is false
		       otherwise you will have an infinite loop which can crash the code
		the EXIT can go after the code to be ran
		*/
		
		System.out.println("Example 4");
		
		int x = 0; // variable initiated/declared and ready to be used on the following code
		while (x < 10) { //run the code until " x<10" is false
			System.out.println(x);
			x++; // increase x by 1 to avoid an infinite loop
		}
		
		// ******** do while loop ******
		
		/* this loop will always iterate at least once. Checks the condition at the end instead
		 * of the beginning like a normal while loop
		 * FORMAT: do {code to be executed} while (conditional statement);
		 */
		
		// Example 5:
		
		System.out.println("Example 5");
		
		int f = 10; //initiate a variable
		do {   // first print " f ", increase " f " by one AND THEN check the conditional statement
			System.out.println(f); //If it was a normal while loop, it would never run or print anything
			f++;                   // because the conditional statement is false from the beginning. 
		} while ( f < 2);

	}

}
