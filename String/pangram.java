class pangram
{
    //Function to check if a string is Pangram or not.
    public static boolean checkPangram  (String str) {
        // your code here
        char[] a=str.toCharArray();
        int arr[]=new int[26];
        for(int i=0;i<a.length;i++)
        {
            a[i]=Character.toLowerCase(a[i]);
            if(a[i]>='a' && a[i]<='z'){
            arr[a[i]-'a']++;
            }
        }
        for(int i=0;i<26;i++)
        {
            if(arr[i]==0)
            {
                return false;
            }
        }
        return true;
    }
}
