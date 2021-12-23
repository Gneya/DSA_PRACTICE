class sum_of_mid {
    int findMidSum(int[] ar1, int[] ar2, int n) {
        // code here
        int k=0;
        int temp[]=new int[n+n];
        for(int i=0;i<n+n;i++)
            {
                if(i<n)
                {
                    temp[i]=ar1[i];
                }
                else
                {
                    temp[i]=ar2[k];
                    k++;
                }
            }
        Arrays.sort(temp);
        int a=temp[(n+n)/2];
        int b=temp[(n+n-1)/2];
        // System.out.println(a);
      //  System.out.println(b);
        return a+b;
    }
    
}
