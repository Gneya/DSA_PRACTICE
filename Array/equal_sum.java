class equal_sum {
    String equilibrium(int arr[], int n) {
        // code here
           if(n == 1 || n == 2) return "NO";
        
        int i = 1 , j = n - 2;
        int sumL = arr[0] , sumR = arr[n - 1];
        
        while(i < j){
            
            if(sumL <= sumR){
                sumL += arr[i];
                i++;
            }else if(sumR < sumL){
                sumR += arr[j];
                j--;
            }
            if(sumL == sumR && i == j){
                return "YES";
            }
            
        }
        return "NO";
    }
}
