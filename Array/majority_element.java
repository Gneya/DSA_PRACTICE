class majority_element
{
    static int majorityElement(int a[], int size)
    {
        // your code here
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<size;i++)
        {
            if(map.containsKey(a[i]))
            {
                map.put(a[i],map.get(a[i])+1);
            }
            else
            {
                map.put(a[i],1);
            }
            //System.out.println(map);
        }
        int temp=1;
        int res=-1;
         for (int s : map.keySet()) {
             if(map.get(s)>Math.round(size/2))
             {
                 res=s;
                 break;
             }
      }
        return res;
    }
}
