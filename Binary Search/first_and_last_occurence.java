class first_and_last_occurence
{
    ArrayList<Long> find(long arr[], int n, int x)
    {
        // code here
        int high=n-1;
        int low=0;
        int mid;
        int first=-1;
        int last=-1;
        while(low<=high)
        {
            mid=(low+high)/2;
            if(arr[mid]==x)
            {
                first=mid;
                high=mid-1;
            }
            else if(arr[mid]<x)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        low=0;
        high=n-1;
        while(low<=high)
        {
            mid=(low+high)/2;
            if(arr[mid]==x)
            {
                last=mid;
                low=mid+1;
            }
            else if(arr[mid]<x)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        ArrayList<Long> res=new ArrayList<>();
        res.add((long)first);
        res.add((long)last);
        return res;
    }
}
