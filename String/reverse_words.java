class reverse_words 
{
    //Function to reverse words in a given string.
    String reverseWords(String A)
    {
        // code here
        char S[]=A.toCharArray();
        Stack<String> stack=new Stack<>();
        String temp="";
        for(int i=0;i<S.length;i++)
        {
            if(S[i]!='.')
            {
                temp+=S[i];
            }
            else
            {
                stack.push(temp);
                stack.push(".");
                temp="";
            }
        }
        stack.push(temp);
        temp="";
        while(!stack.isEmpty())
        {
            temp+=stack.pop();
            //temp+=".";
        }
        return temp;
    }
}
