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
    
     public static int findSecondLargest(int[] arr,int n) {
         /*Time Complexity: O(n), where n is the number of elements in the array.
Space Complexity: O(1) as we are using only a constant amount of extra space.
Note: This approach is the most efficient among the three as it minimizes the number 
of comparisons and finds the second largest element in a single traversal of the array.*/
        if (n < 2)
            return -1; // No second largest element
        
           int largest = -1, secondLargest = -1;

        // finding the second largest element
        for (int i = 0; i < n; i++) {

            // If arr[i] > largest, update second largest with
            // largest and largest with arr[i]
            if(arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
          
            // If arr[i] < largest and arr[i] > second largest, 
            // update second largest with arr[i]
            else if(arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
    
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		int [] arr= {8,8,8,8,9,9};// 1,5,8,8,8,8
		Integer [] ari= {11,55,66,88,73,95};
		System.out.println("second largest numer :"+getSecondLargestNum(arr,arr.length));
		System.out.println("second largest numer :"+getSecondLargestNum1(arr,arr.length));
		System.out.println("second largest numer :"+getSecondLargestNum2(ari,ari.length));
		System.out.println("second largest numer :"+findSecondLargest(arr,arr.length));
		
	}
}