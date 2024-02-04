class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() <= 1){
            return true;
        }
        String modified_str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = modified_str.length()-1;

        while(left<right){
            if(modified_str.charAt(left) != modified_str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
