class balanced_array
{
    long minValueToBalance(long a[] ,int n)
    {
        int low=0;
        int high=n-1;
        int leftsum=0;
        int rightsum=0;
         while(low<high)
        {
           leftsum+=a[low];
           rightsum+=a[high];
           low++;
           high--;
        }
        return Math.abs(leftsum-rightsum);

    }
}
