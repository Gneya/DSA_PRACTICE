class maximum_product {
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) {
        long curr=1;
        long product=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            curr*=arr[i];
            if(product<curr)
            {
                product=curr;
            }
            if(curr==0)
            {
                curr=1;
            }
        }
        curr=1;
        for(int i=n-1;i>=0;i--)
        {
            curr*=arr[i];
            if(product<curr)
            {
                product=curr;
            }
            if(curr==0)
            {
                curr=1;
            }
        }
        return product;
        // code here
    }
}
