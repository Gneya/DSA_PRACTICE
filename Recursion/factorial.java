class factorial{
    static long factorial(int n){
        // code here
        if(n==1)
        return 1;
        if(n==0)
        return 1;
        long f=1;
        f=n*factorial(n-1);
        return f;
    }
}
