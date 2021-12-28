class merge_without_space
{
    //Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        // code here 
        long temp[]=new long[n+m];
        int k=0;
        int i=0;
        int j=0;
        while((i<n)&&(j<m))
        {
            if(arr1[i]<arr2[j])
            {
                temp[k]=arr1[i];
                i++;
            }
            else
            {
                temp[k]=arr2[j];
                j++;
            }
            k++;
        }
        while(i<n)
        {
            temp[k]=arr1[i];
            i++;
            k++;
        }
        while(j<m)
        {
            temp[k]=arr2[j];
            j++;
            k++;
        }
        int x=0;
         j=0;
        while(x<k)
        {
            if(x<n)
            {
                arr1[x]=temp[x];
            }
            else
            {
                arr2[j]=temp[x];
                j++;
            }
            x++;
        }
    }
}
