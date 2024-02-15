class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> letters = new Stack<>();
        StringBuilder sb = new StringBuilder("");

        for(int i=0; i<s.length(); i++){
            char letter = s.charAt(i);
            if(letters.isEmpty()){
                letters.push(letter);
            }else{
                // letters.push(letter);
                if(letters.peek() == letter){
                    letters.pop();
                }
                else{
                    letters.push(letter);
                }
            }
        }
        for(char c : letters){
            sb.append(c);
        }
        return sb.toString();
    }
}


