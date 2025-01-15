/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main{

static  int[] reverseInGroupOfGivenSize (int[] arr,int size){
    int n=arr.length;
    for (int i = 0; i < n; i += size) {
 int left = i;
 int right = Math.min(i + size - 1, n - 1);
 int temp;
 while (left < right) {
temp = arr[left];
arr[left] = arr[right];
arr[right] = temp;
left += 1;
right -= 1;
 }
}
return arr;
}
    
    
	public static void main(String[] args) {
		System.out.println("Hello World");
		 int [] arr={1,2,3,4,5,6,7,8};// 9-2=7 2,0, 9-7=2 7,1 9-10=-1 10,2 ; 
		 //9-11=-2 11,3; 9-5=4 5,4; 9-4=5 4,5
		 int [] arru={2,7,10,11,5,4};
		 int [] arrn={0, -1, 2, -3, 1 ,-4};
		 int arrr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9,10};
		 int target=4;
		 int target2=-2;
	int [] num=	reverseInGroupOfGivenSize(arrr,target);
	for(int n:num)
		System.out.println(n+" ");	 
	}
}