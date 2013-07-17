/**********************************************************************************************************
Joel 
Jul 15, 2013
 There are 5 packages with 5 different problems. The fun part is to solve and then refer.
 The Class names should be self explanatory to explain the purpose of the programs.
 In this project, approximately 3-4 programs are from Project Euler. I encourage you to 
 visit the site and take the coding assignments. Have fun Coding.
/**********************************************************************************************************/
import CodeExamples.*;

public class CodesTest2 {

	/**
	 * There are 5 packages with 5 different problems. The fun part is to solve and then refer.
	 * The Class names should be self explanatory to explain the purpose of the programs.
	 * In this project, approximately 3-4 programs are from Project Euler. I encourage you to 
	 * visit the site and take the coding assignments. Have fun Coding.
	 * @param args
	 */
	
	public static void main(String[] args) {
		// Nth Largest Sum
		int [] ip = {-2,-21,-13,4,14,4,5,6,8,9};
        System.out.println("The Nth largest number in the array is " + new NthLargestNum().getNthLargestNum(ip, 5));
        System.out.println("*******************************************************************");

        // Sum of multiples of 3 and 5
         System.out.println("The sum of mulitples of 3 and 5 upto 1000 is " + new SumOfMultiples().SumOfMultiples(3, 5, 1000));
         System.out.println("*******************************************************************");
        
        // Sum of Even Fiboanacci untill a limit
        System.out.println("The sum of even number of Fibonacci series upto 4000000" + (long)new SumOfEvenFib().SumOfEvenFib(4000000));
        System.out.println("*******************************************************************");
        
        // Largest Prime Number
        System.out.println("The largest prime factor for 600851475143 is " + new LargestPrimeFactor().largestPrimeFactor(600851475143L));
        System.out.println("*******************************************************************");
        
        // Finding the Nth Prime Num
         System.out.println("10001 st prime num is " + new NthPrimeNumber().nthPrimeNum(10001) );
         System.out.println("*******************************************************************");
	}

}
