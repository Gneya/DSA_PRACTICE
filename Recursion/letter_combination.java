class Solution {
    public void solve(String digits,int index,StringBuilder output,List<String> ans,String[] mappings)
    {
        if(digits.length()<=index)
        {
            ans.add(output.toString());
            return ;
        }
        
        int number=Integer.parseInt(String.valueOf(digits.charAt(index)));
        System.out.println(number);
        String value=mappings[number];
        //System.out.println("Hi");
        for(int i=0;i<value.length();i++)
        {
            output.append(String.valueOf(value.charAt(i)));
            solve(digits,index+1,output,ans,mappings);
            output.deleteCharAt(output.length()-1);
        }
    }
    public List<String> letterCombinations(String digits) {
        String[] mappings={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> ans=new ArrayList<String>();
        StringBuilder output = new StringBuilder();
        
        if(digits.length()==0)
        {
            return ans;
        }
        //System.out.println("Hi");
        solve(digits,0,output,ans,mappings);
        
        return ans;
        
        
    }
}
