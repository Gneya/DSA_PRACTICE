class maximum_in_struct_array
{
    public static int findMax(Height arr[], int n)
    {
        int max=0;
       // your code here
       for(int i=0;i<n;i++)
       {
           arr[i].feet*=12;
           arr[i].feet+=arr[i].inches;
           if(max<arr[i].feet)
           {
               max=arr[i].feet;
           }
       }
       return max;
    }
    
}
