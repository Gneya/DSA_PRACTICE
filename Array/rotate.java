class rotate{
    public static void main(String[] args){
             //code
             Scanner sc = new Scanner(System.in);
             int t = sc.nextInt(); 
             
             while(t-->0){
                 int n = sc.nextInt(); int d = sc.nextInt();
                 int[] arr = new int[n]; int[] arr1 = new int[n];
                 for(int i=0; i<n; i++){
                     arr[i] = sc.nextInt(); 
                 }
                 for(int i=0; i<n; i++){
                     arr1[i] = arr[(d+i) % n]; 
                 }
                 for(int j : arr1 ) System.out.print(j+" ");
                 System.out.println();
                 
             }
    }
}
