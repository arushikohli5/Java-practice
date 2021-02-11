class Solution {
    public int longestSubstring(String s, int k) {
        int n=s.length();
        int freq[]=new int[26];
        
        if(n<k){
            return 0;
        }
        
        for(int i=0;i<n;i++){
            freq[s.charAt(i)-'a']++;
        }
        
        for(int i=0;i<n;i++){
            if(freq[s.charAt(i)-'a']>=k){
                continue;
            }
            
            int j=i+1;
            while(j<n&&freq[s.charAt(j)-'a']<k)
                j++;
            
            return Math.max(longestSubstring(s.substring(0,i),k), longestSubstring(s.substring(j),k));
        }
        
        return s.length();
    }
}
