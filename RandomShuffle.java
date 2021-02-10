class Solution {

    private int[] origianl = null;
    
    public Solution(int[] nums) {
        origianl = nums;
    }
    
    public int[] reset() {
        return origianl;
    }
    
    public int[] shuffle() {
        int[] arr = origianl.clone();
        
        Random rnd = new Random();
        for(int i = 0; i < arr.length; i++) {
            int index = rnd.nextInt(arr.length);
            int tmp = arr[i];
            arr[i] = arr[index];
            arr[index] = tmp;
        }
        return arr;
    }
}
