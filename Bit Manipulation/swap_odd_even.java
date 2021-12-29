class swap_odd_even
{
    //Function to swap odd and even bits.
    public static int swapBits(int n) 
    {
	    // Your code
	    int odd=n & 0x55555555;
	    int even=n & 0xAAAAAAAA;
	     even=even>>1;
	     odd=odd<<1;
	    return even|odd;
	}
    
}
