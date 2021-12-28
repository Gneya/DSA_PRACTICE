
class merge_sort
{
    void merge(int arr[], int l, int mid, int r)
    {
    
         int[] temp=new int[(r-l)+1];
         int k=0,i=l,j=mid+1;
         while(i<=mid && j<=r)
         {
             if(arr[i]<arr[j])
             {
                 temp[k]=arr[i];
                 i++;
             }
             else
             {
                 temp[k]=arr[j];
                 j++;
             }
             k++;
         }
         while(i<=mid)
         {
             temp[k]=arr[i];
             i++;
             k++;
         }
          while(j<=r)
         {
             temp[k]=arr[j];
             j++;
             k++;
         }
         for(int item:temp)
         {
             arr[l]=item;
             l++;
         }
    }
    void mergeSort(int arr[], int l, int r)
    {
        if(l<r)
        {
            int mid=(l+r)/2;
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r);
            merge(arr,l,mid,r);
        }
    }
}
