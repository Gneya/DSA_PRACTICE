import java.util.*;
import java.lang.*;

class Main
{
	public static void reverse(char[] ch,int low,int high)
	{
		if(low>high)
			return;
		
		char temp=ch[low];
		ch[low]=ch[high];
		ch[high]=temp;
		
		high--;
		low++;
		
		reverse(ch,low,high);
	
		
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		
		String str=s.next();
		String copy=str;
		char ch[]=str.toCharArray();
		int low=0;
		int high=ch.length-1;
		reverse(ch,low,high);
		System.out.println(String.valueOf(ch));
		if(copy.equals(String.valueOf(ch)))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
}
