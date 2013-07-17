/********
Joel 
Jul 15, 2013
********/

package CodeExamples;

public class NthPrimeNumber {
	// Finding the Nth Prime Num
    public long nthPrimeNum(long givenNum){
        
        // Finding the 10001'st prime number
        long count=0;
        long outputNum=1;
        
        while(count != givenNum){
             outputNum+=1;
             if(new LargestPrimeFactor().isPrime(outputNum)){
                 count++;   
             }
         }
        
        return outputNum;
    }
}
