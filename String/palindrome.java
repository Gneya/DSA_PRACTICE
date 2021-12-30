class palindrome {
    int isPalindrome(String S) {
        // code here
        char b[]=S.toCharArray();
        int start=0;
        int end=b.length-1;
        while(start<=end)
        {
            char temp=b[start];
            b[start]=b[end];
            b[end]=temp;
            
            start++;
            end--;
        }
       if(S.equals(String.valueOf(b)))
       {
           return 1;
       }
       else
       {
           return 0;
       }
    }
};
