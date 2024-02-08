import java.util.Stack;

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> operands = new Stack<>();

        for (String s : tokens) {
            if (s.matches("-?\\d+")) { // Check if the string is a number
                operands.push(Integer.parseInt(s));
            } else {
                int operand2 = operands.pop();
                int operand1 = operands.pop();
                switch (s) {
                    case "+":
                        operands.push(operand1 + operand2);
                        break;
                    case "-":
                        operands.push(operand1 - operand2);
                        break;
                    case "*":
                        operands.push(operand1 * operand2);
                        break;
                    case "/":
                        operands.push(operand1 / operand2);
                        break;
                }
            }
        }
        return operands.peek();
    }
}
