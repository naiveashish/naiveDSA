class Solution {
    public int countDigits(int n) {
        int num = n;
        int c = 0;
        while(num!=0){
            int rem = num%10;
            if(n%rem==0){
                c++;
            }
            num = num/10;
        }
        return c;
    }
}