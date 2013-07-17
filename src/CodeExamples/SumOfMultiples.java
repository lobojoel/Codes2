/********
Joel 
Jul 15, 2013
********/

package CodeExamples;

public class SumOfMultiples {
	// Sum Of Mulitples
    public int SumOfMultiples(int num1, int num2, int limit){
        int total=0;
        
        for(int count=0; count<limit; count++){
            if((count%num1==0 && count%num2==0) ||
                    count%num1==0 || count%num2==0)
            {
                total += count; 
                continue;
            }    
        }
        
        return total;    
    }
}
