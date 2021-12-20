class sort_0_1_2
{
    public static void sort012(int a[], int n)
    {
        // code here 
         int one=0;
        int zero=0;
        int two=0;
        for(int i=0;i<n;i++)
        {
           
        if(a[i]==0)zero++;
        if(a[i]==1)one++;
        if(a[i]==2)two++;
        }
        for(int i=0;i<n;i++)
        {
            if(zero!=0)
            {
                a[i]=0;
                zero--;
            }
            else if(one!=0)
            {
                a[i]=1;
                one--;
            }
            else if(two!=0)
            {
                a[i]=2;
                two--;
            }
        }
    }
    
}
