/********
Joel 
Jul 15, 2013
********/

package CodeExamples;

public class SumOfEvenFib {
	 // Sum of even Numbers in a Fiboannci untill a certain number
    public long SumOfEvenFib(long limit){
        long sum=0; long prevNum = 0 , nextNum=1; 
        long currentNum = 0;
        
        for(; currentNum<limit; ){
        
            currentNum = prevNum + nextNum;
            prevNum = nextNum;
            nextNum = currentNum; 
            
            if(currentNum%2 == 0){
                sum += currentNum;
            }
        }
        return sum;
    }
}
