class Solution {
    public boolean isPalindrome(String s) {
        String s1 = "";
		for(char c : s.toCharArray()) {
			if(Character.isDigit(c)|| Character.isLetter(c)) {
				s1 +=c;
			}
		}
		s1 = s1.toLowerCase();
		int l = 0;
		int r  = s1.length()-1;
		while(l<=r) {
			if(s1.charAt(l)!=s1.charAt(r)) {
				return false;
			}
			l++;
			r--;
		}
        return true;
    }
}