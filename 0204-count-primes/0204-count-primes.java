class Solution {
    public int countPrimes(int n) {
        boolean prime[] = new boolean[n + 1];
        for (int i = 0; i <= n; i++){
            prime[i] = true;
        }
        if(n<=2){
            return 0;
        }
        if(n==3){
            return 1;
        }
        for (int p = 2; p * p <= n; p++) {
            if (prime[p] == true) {
                for (int i = p * p; i <= n; i += p)
                    prime[i] = false;
            }
        }
 
        int c =0;
        for (int i = 2; i < n; i++) {
            if (prime[i] == true)
                c++;
        }
        return c;
    }
 
}