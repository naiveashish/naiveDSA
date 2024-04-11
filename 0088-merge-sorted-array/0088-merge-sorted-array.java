class Solution {
    public void merge(int[] a1, int m, int[] a2, int n) {
        int i = m-1; //non zero ele index of a1;
        int j = n-1; // last ind of a2;
        int k = m+n-1; // last ind of a1

        while(i>=0 && j>=0){
            if(a1[i]>=a2[j]){
            a1[k--] = a1[i--];
            }
            else{
                a1[k--] = a2[j--];
            }
        }
        while(j>=0){
            a1[k--] = a2[j--];
        }

    }
}
