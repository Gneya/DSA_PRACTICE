class print_1_to_n{
    static void printTillN(int N){
        // code here
        if(N==0)
        return;
        else
        {
            printTillN(N-1);
            System.out.print(N+" ");
        }
    }
}
