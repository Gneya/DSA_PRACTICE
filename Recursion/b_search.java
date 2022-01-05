import java.util.*;
import java.lang.*;

class b_search
{
	public static int binary_search(int arr[],int l,int h,int k)
	{
		if(l>h)
		{
			return -1;
		}
		int mid=(l+h)/2;
		if(arr[mid]==k)
		{
			return mid;
		}
		else if(arr[mid]>k)
		{
			return binary_search(arr,l,mid-1,k);
		}
		else
		{
			return binary_search(arr,mid+1,h,k);
		}
	}
	public static void main(String args[])
	{
		int arr[]={2,4,6,8,9,11};
		int key=15;
		int low=0;
		int high=arr.length-1;
		System.out.println(binary_search(arr,low,high,key));
	}
}
