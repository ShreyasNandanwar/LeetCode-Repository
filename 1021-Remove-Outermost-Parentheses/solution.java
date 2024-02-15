class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> parentheses = new Stack<>();
        StringBuilder sb = new StringBuilder("");   //built to create a string that satisfies the condition

        for(int i=0; i<s.length(); i++){
            char bracket = s.charAt(i);             //stores the current(i) bracket temporarily
            if(s.charAt(i)=='('){          
                //If the stack size is greater than zero after pushing or popping, it means that the parenthesis is not an outer parenthesis, and it is added to the result string. If the stack size is zero, it means that the parenthesis is an outer parenthesis and it is not added to the result string.         
                if(parentheses.size()>0){  
                    sb.append(bracket);         
                }
                parentheses.push(bracket);
            }else{
                parentheses.pop();
                if(parentheses.size()>0){
                    sb.append(bracket);
                }
            }
        }
        return sb.toString();
    }
}
