import java.util.*;
import java.lang.*;

class Main
{
	public static int pow(int a,int b)
	{
		if(b==0)
			return 1;
		
		if(b==1)
			return a;
		
		int ans=pow(a,b/2);
		
		if(b%2==0)
		{
			return ans*ans;
		}
		else
		{
			return a*ans*ans;
		}
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		System.out.println("Enter power:");
		int b=s.nextInt();
		System.out.println(pow(a,b));
	}
}
