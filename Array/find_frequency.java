class find_frequency{
    int findFrequency(int A[], int x){
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        for(int i=0;i<A.length;i++)
        {
           if(A[i]==x)
           {
               count++;
           }
        }
        return count;
    }
}
