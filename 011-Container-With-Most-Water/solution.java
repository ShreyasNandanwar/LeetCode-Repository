class Solution {
    public int maxArea(int[] height) {
        int maxArea=0, minHeight;
        int i=0;
        int j = height.length-1;
        while(i<j){
            minHeight = Math.min(height[i], height[j]);
            maxArea = Math.max(maxArea, (j-i)*minHeight);

            while(i<j && height[i]<=minHeight){
                i++;
            }
            while(i<j && height[j]<=minHeight){
                j--;
            }

        }
        return maxArea;
    }
}
