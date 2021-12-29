class lucky_alive{
    static int find(int N){
        // code here
          int ans = 1, s = 0;
   while (N > 1) {
      ++s;
      ans += (N & 1) << s;
      N >>= 1;
   }
   return ans;
    }
}
