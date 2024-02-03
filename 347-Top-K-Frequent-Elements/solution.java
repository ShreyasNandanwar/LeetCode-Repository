class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] bucket = new List[nums.length+1];
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for(int n : nums){
            freqMap.put(n, freqMap.getOrDefault(n, 0)+1);  //we have a key:element and its value : frequency
        }

        for(int key : freqMap.keySet()){
            int freq = freqMap.get(key);
            if(bucket[freq] == null){
                bucket[freq] = new ArrayList<>();
            }bucket[freq].add(key);
        }

        int[] res = new int[k];
        int count = 0;
                
        for(int pos=bucket.length-1; pos>=0 && count<k; pos--){
            if(bucket[pos] != null){
                for(Integer i : bucket[pos]){
                    res[count++] = i;
                }
            }
        }        
        return res;

    }
}
