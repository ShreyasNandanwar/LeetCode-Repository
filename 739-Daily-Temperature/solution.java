class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<Integer> incr = new Stack<>();
        
        for(int i=0; i<temperatures.length; i++){
            while(!incr.isEmpty() && temperatures[i]>temperatures[incr.peek()]){
                int j = incr.pop();
                result[j] = i - j;
            }
            incr.push(i);
        }
        return result;
    }
}
