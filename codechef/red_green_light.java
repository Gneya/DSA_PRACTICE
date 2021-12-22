/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class red_green_light
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	   	Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
		    int size=s.nextInt();
		    int height=s.nextInt();
		    int flag=0;
		    for(int j=0;j<size;j++)
		    {
		        int temp=s.nextInt();
		        if(temp>height)
		        {
		            flag++;
		        }
		    }
		   System.out.println(flag);
		}
	}
}
