package TesterClasses;

import orderedStructures.Arithmetic;
import orderedStructures.Fibonacci;
import orderedStructures.Geometric;
import orderedStructures.Progression;

public class ProgressionTester1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Progression p;
		/*Progression p2;*/
		/*Progression p3;*/
		
		System.out.println("Testing Fibonaci:"); 
		p = new Fibonacci(); 
		p.printAllTerms(20);
		
		
		System.out.println("\n\n\nTesting Geometric:"); 
		p = new Geometric(2, 3); 
		p.printAllTerms(20);
		
		System.out.println("\n\n\nTesting Arithmetic:"); 
		p = new Arithmetic(2, 3); 
		p.printAllTerms(20);
		
		//Testing Equals Geometric
		/*p2 = new Geometric(2, 3); 
        boolean e = p.equals(p);
        System.out.println(e);*/
		
		//Testing Equals Arithmetic
		/*p2 = new Arithmetic(2, 3); 
        boolean e = p2.equals(p);
        System.out.println(e);*/

		//Testing Add and Substract Progressions
		/*p2 = new Arithmetic(2,3);
		p2.printAllTerms(20);
		System.out.println("\n\n\nTesting Arithmetic Add Progression:"); 
		p3 = p2.addProg(p);
		p3.printAllTerms(20);
		System.out.println("\n\n\nTesting Arithmetic Subtract Progression:"); 
		p3 = p2.subtractProg(p);
		p3.printAllTerms(20);*/
		
	}

}
