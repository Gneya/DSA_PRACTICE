 class product_of_maxmin{
    
    // Function for finding maximum and value pair
    public static long find_multiplication (int a[], int b[], int n, int m) {
        // Complete the Function
    
         Arrays.sort(a);
        Arrays.sort(b);
        return a[n-1]*b[0];
    }
    
    
}
