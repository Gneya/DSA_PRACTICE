class search_in_rotated
{
   int search(int arr[], int l, int h, int target)
    {
	    int low=l,high=h;
	    
	    while(low<=high)
	    {
	       int mid=(low+high)/2; 
	       if(arr[mid]==target)
	            return mid;
	       if(arr[low]<arr[mid])
	       {
	           if(target>=arr[low] && target<arr[mid])
	               high=mid-1;
	           else
	                low=mid+1;
	       }
	       else
	       {
	           if(target>arr[mid] && target<=arr[high])
	                low=mid+1;
	           else
	                high=mid-1;
	       }
	    }
	    return -1;
    }
}
