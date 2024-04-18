class Solution {
    public int singleNumber(int[] a) {
        int n = a.length;
        Arrays.sort(a);
        if(n==1){
            return a[0];
        }
        if(a[0]!=a[1]){
            return a[0];
        }
        if(a[n-1]!=a[n-2]){
            return a[n-1];
        }

        int l = 0;
        int h = a.length-1;

        while(l<=h){
            int m = (l+h)/2;
            if((m == 0 || a[m - 1] != a[m]) && (m == a.length - 1 || a[m] != a[m + 1])){
                return a[m];
            }
            if(a[m]==a[m-1]){
                int lc = (m-l) + 1;
                if(lc%2==0){
                    l = m+1;
                }
                else{
                    h = m-2;
                }
            }
            if(a[m]==a[m+1]){
                int rc = h-m+1;
				
				if(rc%2==0) {
					h = m-1;
				}
				else {
					l = m+2;
				}
            }
        }
        return -1;
    }
}