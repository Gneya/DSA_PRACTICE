class Solution
{
     static int isPossible(int arr[],int mid,int k)
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			int sub=(arr[i]-mid);
			if(sub<0)
			{
			sub=0;
			}
			sum+=sub;
		}
		return sum;
	}
    static int find_height(int a[], int n, int k)
    {
		int high=-1;
		for(int i=0;i<n;i++)
		{
			if(high<a[i])
			{
				high=a[i];
			}
		}
		
		int low=0;
		int mid;
		int ans=-1;
		while(low<=high)
		{
			mid=(low+high)/2;
			int sum=isPossible(a,mid,k);
				if(sum<k)
				{
					high=mid-1;
				}
				else if(sum>k)
				{
					low=mid+1;
						
				}
				else
				{
					ans=mid;
					break;
				}
		}
		return ans;
    }
}
