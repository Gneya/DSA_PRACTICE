class remove_duplicate {
    int remove_duplicate(int A[],int N){
          int[] b = new int[N];
              b[0] = A[0];
              int counter = 1;
              for (int i = 1; i < N; i++)
                 if(A[i-1] != A[i])
                 {
                       b[counter] = A[i];
                       counter++;
                 }

                 for (int i = 0; i < counter; i++)
                      A[i] = b[i];
 
                return counter;
    }
}
