/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class two_rooks
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
		    int x1=s.nextInt();
		    int x2=s.nextInt();
		    int y1=s.nextInt();
		    int y2=s.nextInt();
		    if(x1==y1||x2==y2)
		    {
		        System.out.println("YES");
		    }
		    else
		    {
		        System.out.println("NO");
		    }
		}
	}
}
