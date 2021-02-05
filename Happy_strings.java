class Solution {
    public String getHappyString(int n, int k) {
        ArrayList<String> ans=new ArrayList<>();
        getHappyString(n,k,"",ans,'?');
        if(k>ans.size()){
            return "";
        }
        else
           return ans.get(k-1);
    }
    
    
    public void getHappyString(int n,int k,String s,ArrayList<String>ans, char last){
        
        if(n==0){
            ans.add(s);
            return;
        }
        if(last=='?'){
            getHappyString(n-1,k,s+'a',ans,'a');
            getHappyString(n-1,k,s+'b',ans,'b');
            getHappyString(n-1,k,s+'c',ans,'c');
        }
        else if(last=='a'){
            getHappyString(n-1,k,s+'b',ans,'b');
            getHappyString(n-1,k,s+'c',ans,'c');
        }
        else if(last=='b'){
            getHappyString(n-1,k,s+'a',ans,'a');
            getHappyString(n-1,k,s+'c',ans,'c');
        }
        else{
            getHappyString(n-1,k,s+'a',ans,'a');
            getHappyString(n-1,k,s+'b',ans,'b');
        }
    }
}
