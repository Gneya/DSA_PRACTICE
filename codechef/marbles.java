/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class marbles
{
    static boolean isVowel(char c)
    {
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
        {
            return true;
        }
        else
        {
            return false;
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
		    int size=s.nextInt();
		    String str1=s.next();
		    String str2=s.next();
		    char a[]=str1.toCharArray();
		    char b[]=str2.toCharArray();
		    int fre[]=new int[26];
		    int ans=0;
		    for(int x=0;x<a.length;x++)
		    {
		        if(a[x]==b[x])
		        {
		            continue;
		        }
		        if(a[x]!='?' && b[x]!='?')
		        {
		            if((isVowel(a[x]) && isVowel(b[x]))||(!isVowel(a[x]) && (!isVowel(b[x]))))
		            {
		                ans+=2;
		            }
		            else
		            {
		                ans++;
		            }
		        }
		        else
		        {
		            if(a[x]!='?')
		            {
		                fre[a[x]-'a']++;
		            }
		            else
		            {
		                fre[b[x]-'a']++;
		            }
		        }
		    }
		    int c1=Integer.MAX_VALUE;
		    int vc=0;
		    int cc=0;
		    for(int x=0;x<26;x++)
		    {
		        if(isVowel((char)(x+'a')))
		        {
		            vc+=fre[x];
		        }
		        else
		        {
		            cc+=fre[x];
		        }
		    }
		     for(int x=0;x<26;x++)
		    {
		        if(isVowel((char)(x+'a')))
		        {
		            c1=Math.min(c1,2*(vc-fre[x])+cc);
		        }
		        else
		        {
		            c1=Math.min(c1,2*(cc-fre[x])+vc);
		        }
		    }
		    
		   if(c1!=Integer.MAX_VALUE)
		   {
		       ans+=c1;
		   }
		   System.out.println(ans);
		}
	}
}
