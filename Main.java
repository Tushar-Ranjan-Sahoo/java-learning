
import java.util.*;
public class Main {
  	public static void Reverse(int[] arr,int start, int end){
		  while(start<= end){
			  int temp = arr[start];
			  arr[start]=arr[end];
			  arr[end]=temp;
		  }

	}
	public static void Ratateelettoleft(int[] arr,int n , int k ){
		Reverse(arr,0,k-1);
		Reverse(arr,k,n-1);
		Reverse(arr,0,n-1);
	}
	public static void main(String[] args){
		  int[] arr = {1,2,3,45,6,435,6,54,6,57,46,4};
		  int n = arr.length;
		  int k = 2;

		  Ratateelettoleft(arr,n,k);

		System.out.print("-===================================");

		for(int i = 0 ; i<n;i++)
			System.out.print(arr[i]+" ");
	}

}


