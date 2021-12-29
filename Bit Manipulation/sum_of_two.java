class sum_of_two
{
    int sum(int a , int b)
    {
        //code here
        while(b!=0)
        {
            int temp=(a&b)<<1;
            a=a^b;
            b=temp;
        }
        return a;
    }
}
