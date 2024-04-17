class Solution {
    public void reverse(int si, int ei, int a[]){
        while(si<ei){
            int t = a[si];
            a[si] = a[ei];
            a[ei] = t;

            si++;
            ei--;
        }
    }
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        if(k<0){
            k = k+ nums.length;
        }
        reverse(0, nums.length - 1, nums);
    reverse(0, k - 1, nums);
    reverse(k, nums.length - 1, nums);

    }
}