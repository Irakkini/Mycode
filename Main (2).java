/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main

{
    public static void findThirdLargest(int []a,int n){
        int result=0;
        
        if(n<3){
            return;
        }
         int first=a[0];
         for(int i=1;i<n;i++){
             if(a[i]>first){
                 first=a[i];
             }
         }
         
         int second =-1;
         for(int i=0;i<n;i++){
             if(a[i]>second && a[i]<first){
                 second=a[i];
             }
         }
         
         int third =-1;
         for(int i=0;i<n;i++){
             if(a[i]>third && a[i]<second){
                 third=a[i];
             }
         }
         if(third!=-1){
      System.out.println("third largest  "+third);
      } else{
          System.out.println("No third largest present "+third);
      }
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		int [] arr={9,9,8,7,9,8};
		int n=arr.length;
		findThirdLargest(arr,n);
	}
}