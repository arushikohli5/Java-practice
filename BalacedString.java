class Solution {
    public int balancedString(String s) {
        /*char ch[]=s.toCharArray();
        int len=s.length();
        int n=len/4,sum=0;
        int countq=0,countw=0,counte=0,countr=0;
        for(int i=0;i<len;i++){
            if(ch[i]=='Q'){
                countq++;
            }
            if(ch[i]=='R'){
                countr++;
            }
            if(ch[i]=='W'){
                countw++;
            }
            if(ch[i]=='E'){
                counte++;
            }
        }
        System.out.printf("%d %d %d %d %d",counte,countr,countw,countq,n);
        
        if(counte==n&&countw==n&&countr==n&&countq==n){
            return 0;
        }
        else if(counte!=n&&counte>n){
            sum=sum+(counte-n);
        }
        else if(countq!=n&&countq>n){
            sum=sum+(countq-n);
        }
        else if(countr!=n&&countr>n){
            sum=sum+(countr-n);
        }
        else if(countw!=n&&countw>n){
            sum=sum+(countw-n);
        }
        
        return sum;*/
        
         final int n = s.length();
        final int k = n / 4;

        int ans = n;
        int[] count = new int[128];

        for (char c : s.toCharArray())
          ++count[c];

        for (int i = 0, j = 0; i < n; ++i) {
          --count[s.charAt(i)];
          while (j < n && count['Q'] <= k && count['W'] <= k && count['E'] <= k && count['R'] <= k) {
            ans = Math.min(ans, i - j + 1);
            ++count[s.charAt(j)];
            ++j;
          }
        }

        return ans;
    }
}
