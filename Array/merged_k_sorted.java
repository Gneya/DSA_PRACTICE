class Pair implements Comparable<Pair>
{
    int li;
    int di;
    int data;
    
    Pair(int li,int di,int data)
    {
        this.li=li;
        this.di=di;
        this.data=data;
    }
    
    public int compareTo(Pair o)
    {
        return this.data-o.data;
    }
}
class merged_k_sorted
{
    //Function to merge k sorted arrays.
    public static ArrayList<Integer> mergeKArrays(int[][] arr,int K) 
    {
    PriorityQueue<Pair> p=new PriorityQueue<>();
     for(int i=0;i<K;i++)
     {
         p.add(new Pair(i,0,arr[i][0]));
     }
    ArrayList<Integer> res=new ArrayList<Integer>();
     while(p.size()>0)
     {
         Pair pd=p.remove();
         res.add(pd.data);
         pd.di++;
         
         if(pd.di<arr[pd.li].length)
         {
             pd.data=arr[pd.li][pd.di];
             p.add(pd);
         }
     }
     return res; 
    }
}
