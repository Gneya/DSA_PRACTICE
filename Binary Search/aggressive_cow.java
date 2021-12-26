import java.util.*;

public class aggressive_cow 
{
    public static boolean isPossible(ArrayList<Integer> stalls,int k,int mid)
    {
        int cows=1;
        int last=stalls.get(0);
        for(int i=0;i<stalls.size();i++)
        {
            if(stalls.get(i)-last>=mid)
            {
                cows++;
                if(cows==k)
                {
                   return true; 
                }
                last=stalls.get(i);
            }
        }
        return false;
    }
    public static int aggressiveCows(ArrayList<Integer> stalls, int k) 
    {
        Collections.sort(stalls);
        //    Write your code here.
        int ans=-1;
        int low=0;
        int high=-1;
        for(int i=0;i<stalls.size();i++)
        {
            high=Math.max(high,stalls.get(i));
        }
        int mid;
        while(low<=high)
        {
            mid=low+(high-low)/2;
            if(isPossible(stalls,k,mid))
            {
                ans=mid;
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return ans;
    }
}
