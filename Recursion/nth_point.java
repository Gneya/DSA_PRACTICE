class nth_point
{
    public int nthPoint(int n)
    {
        // Code here
        if(n<0)
        {
            return 0;
        }
        if(n==0)
        {
            return 1;
        }
        int ans= nthPoint(n-1)+nthPoint(n-2);
        return ans;
    }
}
