class Solution {
    public int[] topKFrequent(int[] a, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int freq[]=new int[a.length];
        Arrays.sort(a);
        int count=0;
        
        for(int i=0;i<a.length;i++){
            map.put(a[i],map.getOrDefault(a[i],0)+1);
        }
        
        
        Queue<Integer> minHeap=new PriorityQueue<>((c,b)->map.get(c)-map.get(b));
        
        for(int i : map.keySet()){
            minHeap.add(i);
            if(minHeap.size()>k){
                minHeap.poll();
            }
            
        }
        
        int arr[]=new int[k];
        int index=0;
        while(minHeap.size()!=0){
            //minHeap.poll();
            arr[index++]=minHeap.poll();
        }
        return arr;
    }
}
