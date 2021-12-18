class multiply_sum{
    
   
    // Function for finding maximum and value pair
    public static int multiply (int arr[], int n) {
        //Complete the function
        int left=0;
        int right=0;
        int mid=n/2;
        for(int i=0;i<mid;i++)
        {
            left+=arr[i];
        }
        for(int i=mid;i<n;i++)
        {
            right+=arr[i];
        }
        return left*right;
    }
    
    
}
