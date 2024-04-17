class Solution {
    public int findMaxConsecutiveOnes(int[] a) {
        int ans = 0;
        int temp = 0;
        for(int i = 0; i <a.length;i++){
            if(a[i]==1){
                temp++;
                ans = Math.max(ans,temp);
            }
            else{
                temp = 0;
            }
        }
        return ans;
    }
}
