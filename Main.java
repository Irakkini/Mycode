/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java .util.*;
public class Main

{
    public static int getSecondLargestNum(int[] a,int n){
      int temp=0;
      
      for(int i=0;i<n;i++){
          for(int j=i+1;j<n;j++){
              if(a[i]>a[j]){
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                
              }
          }
      }
      	
      System.out.println(a[0]);
      for(int i=n-2;i>=0;i--){
          if(a[i]!=a[n-1]){
              temp=a[i];
              return temp;
          } else{
             temp=-1; 
          }
          
      }
      return temp;
      
    }
    public static int getSecondLargestNum1(int[] a,int n){
        int temp=0;
      Arrays.sort(a);
      for(int i=n-2;i>=0;i--){
          if(a[i]!=a[n-1]){
              temp=a[i];
              return temp;
          } else{
             temp=-1; 
          }
          
      }
      return temp;
      
    }
    public static int getSecondLargestNum2(Integer[] a,int n){
      List<Integer> iList=Arrays.asList(a);
      Collections.sort(iList);
      int result=iList.get(n-4);
      return result;
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		int [] arr= {7,8,8,8,8,8};// 1,5,8,8,8,8
		Integer [] ari= {11,55,66,88,73,95};
		System.out.println("second largest numer :"+getSecondLargestNum(arr,arr.length));
		System.out.println("second largest numer :"+getSecondLargestNum1(arr,arr.length));
		System.out.println("second largest numer :"+getSecondLargestNum2(ari,ari.length));
		
	}
}