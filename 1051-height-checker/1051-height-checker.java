class Solution {
    public int heightChecker(int[] h) {
        int a[] = new int[h.length];
        for(int i = 0; i<h.length;i++){
            a[i] = h[i];
        }
        Arrays.sort(a);
        int res = 0;
        for(int i = 0; i<a.length;i++){
            if(a[i]!=h[i]){
                res++;
            }
        }
        return res;
    }
}