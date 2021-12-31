class twice_counter
{
    public int countWords(String list[], int n)
    {
        // code here 
        HashMap<String,Integer> map=new HashMap<String,Integer>();
         int count=0;
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(list[i]))
            {
                int temp=map.get(list[i]);
                map.put(list[i],temp+1);
            }
            else
            {
                map.put(list[i],1);
            }
        }
    
         for(String key:map.keySet())
            {
           if(map.get(key)==2)
           {
               count++;
           }
       }
		return count;
    }
}
