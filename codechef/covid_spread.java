/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
		    int people=s.nextInt();
		    int days=s.nextInt();
		    double cases=0;
		    if(days<=10)
		    {
		        cases=Math.pow(2,days);
		    }
		    else
		    {
		        cases=Math.pow(2,10)*Math.pow(3,days-10);   
		    }
		    if((int)cases>people)
		    {
		        System.out.println(people);
		    }
		    else
		    {
		        System.out.println((int)cases);
		    }
		}
	}
}
