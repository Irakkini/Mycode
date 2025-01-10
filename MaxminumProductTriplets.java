/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{//Maximum product of a triplet
public static int getMaxProduct(int [] a,int n){
    
    if(n<3){
        System.out.println("invalid");
        return -1;
        }
        
        int maxA=Integer.MIN_VALUE,
        maxB=Integer.MIN_VALUE,
        maxC=Integer.MIN_VALUE;
        
        
        int minA=Integer.MAX_VALUE,
        minB=Integer.MAX_VALUE;
        
        for(int i=0;i<n;i++){
            if(a[i]>maxA){
                maxC=maxB;
                maxB=maxA;
                maxA=a[i];
            } else if(a[i]>maxB){
                maxC=minB;
                minB=a[i];
            } else if(a[i]>maxC){
                maxC=a[i];
            }
            
            if(a[i]<minA){
               minB=minA;
               minA=a[i];
            } else if(a[i]<minB){
              minB=a[i];  
            }
            
        }
        System.out.println(minA+" "+minB+" "+maxA+" "+maxA+" "+maxB+" "+maxC);
     return Math.max(minA*minB*maxA,maxA*maxB*maxC)  ; 
        
}
	public static void main(String[] args) {
		System.out.println("Hello World");
		int [] arr={1, -4, 3, -6, 7, 0};
		int [] arr={10, 3, 5, 6, 20};
			int [] arr={-10, -3, -5, -6, -20};
		int max=getMaxProduct(arr,arr.length);
		System.out.println("Maximum product of triplet "+max);
	}
}