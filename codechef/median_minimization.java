/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class median_minimization
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
		    int size=s.nextInt();
		    int arr[]=new int[size];
		    for(int j=0;j<size;j++)
		    {
		        arr[j]=s.nextInt();
		    }
		    Arrays.sort(arr);
		  
		    
		    //System.out.println(sub1[(k-1)/2]);
		    System.out.println(Math.abs(arr[size / 2] - arr[(size / 2) - 1]));
		}
	}
}
