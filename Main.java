
import java.util.*;
public class Main {
	public void sort(int arr[]) {

		int n = arr.length;

	for(int i = n-1;i>1;i--){
		for(int j = 0;j<i-1;j++){
			if(arr[j]>arr[j+1]) {
				int temp = arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}

	}
	public void printArr(int arr[]){
		for(int i = 0 ; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args){
		int[] arr  = {84,54,6,56,7,8,6,8,5,67,5,567};
		Main ob = new Main();
		ob.sort(arr);
		ob.printArr(arr);
	}
}


