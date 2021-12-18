class rotate_by_one {
    
    public void rotate(int arr[], int n)
    {
        int temp=arr[n-1];
        for(int i=n-1;i>=0;i--)
    {
        if(i==0)
        {
            arr[0]=temp;
        }
        else
        {
            arr[i]=arr[i-1];
        }
    }
    }
}
