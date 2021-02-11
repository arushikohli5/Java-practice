class RandomizedSet {
   /* Random random;
    Map<Integer,Integer> map;
    ArrayList<Integer> list;
    Random ran;
    
    
    public RandomizedSet() {
        map=new HashMap<>();
        list=new ArrayList<>();
        ran=new Random();
    }
    
    public boolean insert(int val) {
        if(!map.containsKey(val)){
            list.add(val);
            map.put(val,list.size());
            return true;
        }
        return false;
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val)){
            return false;
        }
        
        int index=map.get(val);
        int last=list.get(list.size()-1);
        map.put(last,index);
        list.set(index,last);
        list.remove(list.size()-1);
        map.remove(val);
        return true;
    }
    
    public int getRandom() {
        int num=ran.nextInt(list.size());
        return list.get(num);
    }
}
*/
     Map<Integer,Integer> map = new HashMap<>();
    List<Integer> list = new ArrayList<>();
    /** Initialize your data structure here. */
    public RandomizedSet() {
        
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(!map.containsKey(val)) {
            map.put(val,list.size());
            list.add(val);
            return true;
        } 
        return false;
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
   	public boolean remove(int val) {
		Integer index = map.get(val);
		if (index == null) {
			return false;
		}
        int lastVal = list.get(list.size() - 1);
		list.set(index, lastVal);
		list.remove(list.size() - 1);
        map.put(lastVal,index);
		map.remove(val);
		return true;
	}
    
    /** Get a random element from the set. */
    public int getRandom() {
        int index = new Random().nextInt(list.size());
        return list.get(index);
    }
}
/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
