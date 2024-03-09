public class Solution {
    public int carFleet(int t, int[] p, int[] s) {
        int n = p.length;
        if(n == 0) return 0;

        double[][] cars = new double[n][2];
        for(int i =0; i<n; i++){
            cars[i][0] = p[i];
            cars[i][1] = (double) (t - p[i]) / s[i];
        }

        Arrays.sort(cars, Comparator.comparingDouble((double[] o) -> o[0]).reversed());


        Stack<Double> stc = new Stack<>();

        for (double[] car : cars){
            double currTime = car[1];
            if (!stc.isEmpty() && currTime <= stc.peek()){
                continue;
            } 
            stc.push(currTime);
        }

        return stc.size();
    }
}
