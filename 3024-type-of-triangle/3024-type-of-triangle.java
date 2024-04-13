class Solution {
    public String triangleType(int[] a) {
        if((a[0]+a[1])>a[2] && (a[1]+a[2])>a[0] && (a[2]+a[0])>a[1]){
            if(a[0]==a[1] && a[1]==a[2]){
                return "equilateral";
            }
            else if(a[0]==a[1] || a[1]==a[2] || a[2]==a[0]){
                return "isosceles";
            }
            else{
                return "scalene";
            }
        } else {
            return "none";
        }
    }
}
