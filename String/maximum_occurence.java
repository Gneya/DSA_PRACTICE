class maximum_occurence
{
    //Function to find the maximum occurring character in a string.
    public static char getMaxOccuringChar(String line)
    {
        // Your code here
        int arr[]=new int[26];
        char a[]=line.toCharArray();
        for(int i=0;i<a.length;i++)
        {
            int j=a[i]-'a';
            arr[j]++;
        }
        int max=0;
        int maxindex=0;
        for(int i=0;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
                maxindex=i;
            }
        }
        maxindex=maxindex+'a';
        return (char)maxindex;
    }
    
}
