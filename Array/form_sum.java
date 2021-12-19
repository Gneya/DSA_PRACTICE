class form_sum
{
    long minNum(long A[], int N)
    {
        // Your code goes here
        int sum = 0;
	    for(int i=0; i<N; i++){
	        sum += A[i];
	    }
	    if(sum%2 == 0){
	        return 2;
	    }else{
	        return 1;
	    }
    }
}
