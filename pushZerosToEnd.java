/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
     static void pushZerosToEnd(int[] a) {
         int count=0;
         int n=a.length;
         
         for(int i=0;i<n;i++){
             if(a[i]!=0){
                 int temp=a[i];
                 a[i]=a[count];
                 a[count]=temp;
                 count++;
                 
             }
                 
                 
             }
         }
     
	public static void main(String[] args) {
		System.out.println("Hello World");
		 int [] arr={1,2,0,0,5,0,6,8,0,9,7,0};
		 pushZerosToEnd(arr);
		 for(int nums:arr){
		     System.out.println(nums+" ");
		 }
		 
	}
}