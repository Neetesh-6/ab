package CoreJava;

import java.util.Scanner;

public class arrayodd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array ");
		int a=sc.nextInt();
		//declaring array
		int arr[]=new int[a];
		System.out.println("Enter the elements ");
		//traversing the array 
		for(int i=0;i<a;i++) {
			arr[i]=sc.nextInt();}
		for(int i=0;i<a;i++)
		if(arr[i]%2!=0)
		{
			System.out.println("odd number"+arr[i]);
		
}
}
		}

