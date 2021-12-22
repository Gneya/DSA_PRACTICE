
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class squid_game
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes 
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
		    int size=s.nextInt();
		    int a[]=new int[size];
		    int sum=0;
		    for(int j=0;j<size;j++)
		    {
		        a[j]=s.nextInt();
		        sum+=a[j];
		    }
		    Arrays.sort(a);
		    sum=sum-a[0];
		    System.out.println(sum);
		}
	}
}
