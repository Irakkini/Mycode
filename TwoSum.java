/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
    static void twoSum(int[] a,int target) {
         
         int n=a.length;
         int low=0;
         int high=n-1;
          while(low<high){
              if(a[low]+a[high]>target){
                  high--;
              }else if(a[low]+a[high]<target){
                  low++;
              } else if(a[low]+a[high]==target){
                  System.out.println("pair "+"( "+a[low]+" "+a[high]+")");
                  low++;
                  high--;
              }
              
          }
         
         
         
    }
     
     static  Map<Integer,Integer> twoSumUnSort(int[] a,int target) {
         int n=a.length; 
         int count=0;
         Map<Integer,Integer> temp=new HashMap<>();
         Map<Integer,Integer> result=new HashMap<>();
         for(int i=0;i<n;i++){
             if(temp.get(target-a[i])==null){
                 temp.put(a[i],i);
             } else{
                result.put(a[temp.get(target-a[i])],a[i]);
                count++;
               
             }
         }
          System.out.println(count); 
         return result;
         
     }
	public static void main(String[] args) {
		System.out.println("Hello World");
		 int [] arr={1,2,3,4,5,6,7,8};// 9-2=7 2,0, 9-7=2 7,1 9-10=-1 10,2 ; 
		 //9-11=-2 11,3; 9-5=4 5,4; 9-4=5 4,5
		 int [] arru={2,7,10,11,5,4};
		 int [] arrn={0, -1, 2, -3, 1 ,-4};
		 int target=9;
		 int target2=-2;
		twoSum(arr,target);
		Map<Integer,Integer> re=twoSumUnSort(arrn,target2);
		for(Map.Entry<Integer,Integer> entry :re.entrySet()){
		    System.out.println(entry.getKey()+" "+entry.getValue());
		}
		 
		 
	}
}