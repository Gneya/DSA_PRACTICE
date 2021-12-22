class missing_number
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size)
    {
        // Your code here
        Arrays.sort(arr);
        
        int small = 1;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == small){
                small++;
            }else if(small > arr[i]){
                continue;
            }else if(arr[i] != small)
                return small;
        }
        
        return small;
    }
}
