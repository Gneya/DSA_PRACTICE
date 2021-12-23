class nearest_zero
{
    public static int closestToZero (int arr[], int n)
    {
        // your code here
          Arrays.sort(arr);
        int low = 0 , high = n - 1;
        int res = arr[0] + arr[n - 1];
        while(low < high){
            int sum = arr[low] + arr[high];
            
            if(sum == 0) return 0;
            
            if(sum < 0){
                
                low++;
            }else{
                
                high--;
            }
            
            if(Math.abs(sum) < Math.abs(res)) res = sum;
            if(Math.abs(sum) == Math.abs(res)) res = Math.max(res , sum);
        }
        return res;
    }
}
