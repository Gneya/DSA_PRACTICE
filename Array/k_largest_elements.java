class k_largest_elements {
    int[] kLargest(int[] arr, int n, int k) {
        // code here
        int[] res=new int[k];
        Arrays.sort(arr);
        int i=0;
        n=n-1;
        while(i<k)
        {
            res[i]=arr[n];
            n--;
            i++;
        }
        return res;
    }
}
