class game_with_nos{
    
   
    // Function for finding maximum and value pair
    public static int[] game_with_number (int arr[], int n) {
        // Complete the function
           for(int i=0; i<arr.length-1; i++){
           
           arr[i]=arr[i]^arr[i+1];
       }
       return arr;
    }
    
    
}
