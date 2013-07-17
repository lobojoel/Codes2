/********
Joel 
Jul 15, 2013
********/

package CodeExamples;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class NthLargestNum {
	public int getNthLargestNum(int [] givenArr, int n){
	    
        int nTotal=0;
        int nNthNum = -1;
        
        // Remove Duplicates
        Set<Integer> o_hs = new TreeSet<Integer>();
        for(int insert=0; insert<givenArr.length; insert++)
        {o_hs.add(givenArr[insert]);}
        
        Iterator it  = o_hs.iterator();
        int count=0;
        
        while(it.hasNext()){
            if(count == n){
                break;
            }
            nNthNum = (Integer)it.next();
            count++; 
        }
    
    return nNthNum;    
    }
}
