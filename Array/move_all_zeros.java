class move_all_zeros {
    void pushZerosToEnd(int[] a, int n) {
        // code here
        int count=0;
        int k=0;
        int res[]=new int[n];
        for(int i=0;i<n;i++)
        {
            if(a[i]==0)
            {
                count++;
                continue;
            }
            else
            {
                res[k]=a[i];
                k++;
            }
        }
        while(count>0)
        {
            res[k]=0;
            k++;
            count--;
        }
        for(int i=0;i<n;i++)
        {
            a[i]=res[i];
        }
    }
}
