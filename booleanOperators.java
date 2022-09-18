package week2Videos;

public class booleanOperators {

	public static void main(String[] args) {
		
		// == Equality Operator
		
		System.out.println(" == ");
		System.out.println( 2 == 2);//true
		System.out.println( 2 > 5);//false
		System.out.println( 3 <= 5);//true
		System.out.println( 5 <= 5);//true
		
		// && Both sides HAVE to be true
		
		System.out.println(" && ");
		System.out.println( 2 == 2 && 1 < 5); //true
		System.out.println( true && true);//true
		System.out.println( true && false); // false
		
		// || means one of the comparisons HAS to be true
		
		System.out.println("||");
		System.out.println(true || false);//true
		System.out.println( false || false);// false because one of them is not true
		System.out.println( 2 == 2 || 1 == 5);//true
		System.out.println( 2 == 1 || 2 == 3);//false bacause one of them is not true
		
		
		

	}

}
