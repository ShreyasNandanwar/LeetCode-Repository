class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int[] LP = new int[nums.length];
        int[] RP = new int[nums.length];
        
        int lp = 1;
        for(int i=0; i<nums.length; i++){
            LP[i] = lp;
            lp *= nums[i];
        } 

        int rp = 1;
        for(int i=nums.length-1; i>=0; i--){
            RP[i] = rp;
            rp *= nums[i];
        }

        for(int i=0; i<nums.length; i++){
            res[i] = LP[i] * RP[i];
        }
        return res;
    }
}
