class Solution {
    public int[] intersect(int[] num1, int[] num2) {
        if(num1.length==0||num2.length==0){
            return new int[0];
        }
        Arrays.sort(num1);
        Arrays.sort(num2);
        int i=0,j=0;
        List<Integer> ans=new ArrayList<Integer>();
        while(i<num1.length&&j<num2.length){
            if(num1[i]==num2[j]){
                ans.add(num1[i]);
                i++;
                j++;
            }
            else if(num1[i]<num2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        return toArray(ans);
    }
    private int[] toArray(List<Integer> list) {
        int[] result = new int[list.size()];
         
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
         
        return result;
    }
}
