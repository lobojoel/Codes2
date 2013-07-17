/********
Joel 
Jul 15, 2013
********/

package CodeExamples;

import java.util.ArrayList;
import java.util.List;

public class LargestPrimeFactor {
	 public static int largestPrimeFactor(long number) {
	        int i;
	        for (i = 2; i <= number; i++) {
	            if (number % i == 0) {
	                number /= i;
	                i--;
	            }
	        }
	        return i;
	    }
	 
 	// Get factors of the given Num
    public List<Long> getFactors(long  givenNum){
        List<Long> factors = new ArrayList<Long>();

        long quo = 0;
        long rem = 0;
        long num= givenNum;
        
        for(long  div=2; div<=(givenNum/2); div++){
            if(num%div == 0){
                factors.add(div);
                //System.out.print(div + " X " );
            }            
        }
        return factors;
    }
    
    // check if isPrime
    public boolean isPrime(long  givenNum){
        
        for(long  count=2; count<=Math.sqrt(givenNum); count++){
            if(givenNum % count == 0)
            {return false;}
        }
        return true;    
    }
                                               
    // Largest Prime Number
    public long  largestPrimeNum(long  givenNum){
        long lResult = -1;
        long largestNum = 0;
        
        List<Long > factorsRcvd = new ArrayList<Long>();
        factorsRcvd = getFactors(givenNum);
        
        for(int count=0; count<factorsRcvd.size(); count++){
            if(isPrime((long )factorsRcvd.get(count))){ 
                if(largestNum > ( long)factorsRcvd.get(count))
                { continue; }
                largestNum = (long )factorsRcvd.get(count); 
            }
            
        }
        return largestNum;    
    }
}
