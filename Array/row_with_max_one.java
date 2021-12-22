class row_with_max_one {
    int rowWithMax1s(int arr[][], int n, int m) {
        // code here
        int max=0;
        int sum=0;
        int index=-1;
        for(int i=0;i<n;i++)
        {
             sum=0;
            for(int j=0;j<m;j++)
            {
                sum+=arr[i][j];
            }
            if(sum>max)
            {
                max=sum;
                index=i;
            }
        }
        return index;
    }
}
