import java.util.ArrayList;
public class book_allocation {
    public static boolean isPossible(ArrayList<Integer> arr,int mid,int k)
    {
        int student=1;
        int sum=0;
        for(int i=0;i<arr.size();i++)
        {
            if((sum+arr.get(i))<=mid)
            {
                sum+=arr.get(i);
            }
            else
            {
                student++;
                if(student>k||arr.get(i)>mid)
                {
                    return false;
                }
                sum=arr.get(i);
            }
        }
        return true;
    }
    public static int allocateBooks(ArrayList<Integer> arr, int n, int m) {
        // Write your code here.
        int ans=-1;
        int low=0;
       	int high=0;
        for(int i=0;i<n;i++)
        {
            high+=arr.get(i);
        }
        int mid;
        while(low<=high)
        {
            mid=low+(high-low)/2;
            if(isPossible(arr,mid,m))
            {
                ans=mid;
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return ans;
    }
}
