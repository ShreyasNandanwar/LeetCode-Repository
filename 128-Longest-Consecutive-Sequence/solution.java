class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length <= 1){
            return nums.length;
        }
        Arrays.sort(nums);
        int counter = 1;
        int maxCounter = 1;
        for(int i=1; i<nums.length; i++){
            if(nums[i]==nums[i-1]+1){
                counter++;
            }else if(nums[i] != nums[i-1]){
                counter = 1;
            }

            maxCounter = Math.max(maxCounter, counter);
        }
        return maxCounter;

    }
}
