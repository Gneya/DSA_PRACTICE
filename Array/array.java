class array
{
    public static ArrayList<Integer> array(int a[][], int b[], int n)
    {
        int sum=0;
        int max=0;
        // Complete the function
        for(int i=0;i<n;i++)
        {
            sum+=a[i][i];
            if(max<b[i])
            {
                max=b[i];
            }
            
        }
        ArrayList<Integer> result=new ArrayList();
        result.add(sum);
        result.add(max);
        return result;
    }
}
