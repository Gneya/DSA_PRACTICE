class number_of_ones {
    static int setBits(int N) {
        // code here
        int count=0;
        while(N!=0)
        {
            N=N&(N-1);
            count++;
        }
        return count;
    }
}
