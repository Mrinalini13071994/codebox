package project1;
import java.util.Scanner;
public class Enumeration {
	public static void main(String args[])
	   {
		Scanner sc = new Scanner(System.in);
	     int n =sc.nextInt();
	     int arr[]=new int[n];
	     System.out.println("enter elements");

	        for(int i=0;i<n;i++){//for reading array
	            arr[i]=sc.nextInt();

	        }
	     for(int i: arr){ //for printing array

	            System.out.println(i);

	        }
	     sc.close();      
	     int sum=0;
	     for(int i=0;i<n;i++)
	     {
	         sum=sum+arr[i];
	         System.out.println("sum"+sum);
	     }
	    System.out.println(sum/n);
	    }
	}


