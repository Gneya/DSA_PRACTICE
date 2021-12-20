class kadens_algorithm{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
      int  max_sum = Integer.MIN_VALUE;
       int curr_sum =0;
       for(int i=0;i<n;i++)
       {
           curr_sum += arr[i];
          max_sum = Math.max(max_sum,curr_sum);
           
           
           if(curr_sum <0)
           {
               curr_sum =0;
           }
           
       }
       long max = max_sum;
       return max;
   
   

    }
    
}
