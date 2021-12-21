class minimum_platform
{
    //Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
    static int findPlatform(int arr[], int dep[], int n)
   {
   Arrays.sort(arr);
   Arrays.sort(dep);
   int curr = 1;
       int ans = 1;
   int i = 1,j=0;
   while(i<n)
   {
       if(dep[j]<arr[i]){
           curr--;
           j++;
       }
       else{
           curr++;
           i++;
       }
       ans = Math.max(ans,curr);
   }
       return ans;
   }
    
}
