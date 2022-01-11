import java.util.ArrayList;

class Solution {
    public static void solve(char[] a,ArrayList<String> output,StringBuilder s,int index)
    {
        if(index==a.length)
        {
            return;
        }
        
        for(int i=index;i<a.length;i++)
        {
            s.append(a[i]);
            String temp=String.valueOf(s);
            output.add(temp);
            solve(a,output,s,i+1);
           // System.out.println("DELETING"+s.charAt(s.length()-1)+" length="+s.length());
            s.deleteCharAt(s.length()-1);
            //s.setLength(s.length() - 1);
        }
    }
    
    public static ArrayList<String> subsequences(String str) {
        // Write your code here
        char[] a=str.toCharArray();
        ArrayList<String> output=new ArrayList<String>();
        int index=0;
        StringBuilder s=new StringBuilder("");
        solve(a,output,s,index);
        return output;
    }
}
