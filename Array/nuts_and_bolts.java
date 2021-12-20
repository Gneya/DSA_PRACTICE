class nuts_and_bolts {
    void matchPairs(char nuts[], char bolts[], int n) {
        // code here
          HashMap<Character,Integer>matchValue=new HashMap<>();
       for(int i=0;i<n;i++)
       {
           matchValue.put(nuts[i],i);
       }
       for(int i=0;i<n;i++)
       {
            if(matchValue.containsKey(bolts[i]))
            nuts[i]=bolts[i];
           
       }
       Arrays.sort(nuts);
       Arrays.sort(bolts);
       
   
    }
}
