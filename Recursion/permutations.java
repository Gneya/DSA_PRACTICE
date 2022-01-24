class Solution {
    public void solve(int[] nums,List<Integer> output,List<List<Integer>> ans,int index)
    {
        if(index>=nums.length)
        {
             for (int j : nums)
            {

            output.add(j);
            }
             System.out.println(output);
            ans.add(new ArrayList<>(output));
            output.clear();
            return;
        }
        for(int i=index;i<nums.length;i++)
        {
            int temp=nums[i];
            nums[i]=nums[index];
            nums[index]=temp;
            
            //Collections.addAll(output, nums);
           
            
            solve(nums,output,ans,index+1);
            
             temp=nums[i];
            nums[i]=nums[index];
            nums[index]=temp;
            //System.out.println(output);
            
            
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> output=new ArrayList<Integer>();
        
        solve(nums,output,ans,0);
        
        return ans;
    }
}
