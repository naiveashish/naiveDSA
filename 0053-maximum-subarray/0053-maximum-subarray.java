class Solution {
    public int maxSubArray(int[] a) {
        int max = a[0];
        int sum =  a[0];

        for(int i =1; i <a.length;i++){
            if(sum>=0){
                sum +=a[i]; 
            }
            else{
                sum = a[i];
            }
            
            if(sum > max){
                max = sum;
            }
        }
        return max;
    }
}