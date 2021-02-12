class Solution {
    public void reverseString(char[] s) {
        int n=s.length,x=n-1;
        for(int i=0;i<n/2;i++){
            char temp=s[i];
            s[i]=s[x];
            s[x]=temp;
            x--;
        }
    }
}
