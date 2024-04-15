class Solution {
    public int reverse(int x) {
        int x1 = x;
        int ans = 0;
        while (x1 != 0) {
            int rem = x1 % 10;
            // Check for overflow/underflow before it happens....
            if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && rem > 7)) return 0;
            if (ans < Integer.MIN_VALUE / 10 || (ans == Integer.MIN_VALUE / 10 && rem < -8)) return 0;
            ans = ans * 10 + rem;
            x1 = x1 / 10;
        }
        
        return ans;
    }
};