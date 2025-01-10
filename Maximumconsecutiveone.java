/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
   /* Maximum consecutive one’s (or zeros) in a binary array
Time Complexity : O(n) 
Auxiliary Space : O(1)*/
    public static int getMaxConOnes(int []a,int n){
        int count=0;
        int ZeroCount=0;
        int result=0;
        
        for(int i=0;i<n;i++){
            if(a[i]==0){
                count=0;
            } else {
                count++;
                result=Math.max(result,count);
            }
        }
      return result;  
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		int [] arr={1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1};
		int maxCon=getMaxConOnes(arr,arr.length);
		System.out.println(maxCon);
	}
}