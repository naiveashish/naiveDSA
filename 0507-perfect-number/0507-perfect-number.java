class Solution {
    public boolean checkPerfectNumber(int n) {
        int sum =0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
		    if (n % i == 0) {
                sum+= i;
		    }
		}
		for (int i = (int) Math.sqrt(n); i >= 1; i--) {
		    if (n % i == 0 && i != n / i) {
		        sum+= n/i;
		    }
		}
        if((sum-n)==n){
            return true;
        }
        else{
            return false;
        }
    }
}