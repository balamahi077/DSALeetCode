class Solution {
    public boolean isValid(String s) {

        if(s == null)
            return false;

        boolean isBalancedStatus = true;
        Deque<Character> stack = new ArrayDeque<>(s.length());
        // Stack<Character> stack = new Stack<>(s.length());

        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);

            if(ch == '(' || ch == '[' || ch == '{')
            {
                stack.push(ch);
            }
            else if(ch == ')' || ch == ']' || ch == '}')
            {
                if(stack.isEmpty())
                {
                    return false;
                }
                    
                char stackTop = stack.peek();
                if(stackTop == '(' && ch == ')')
                    stack.pop();
                else if(stackTop == '[' && ch == ']')
                    stack.pop();
                else if(stackTop == '{' && ch == '}')
                    stack.pop();
                else
                {
                    isBalancedStatus = false;
                    break;
                }

            }
        }
        if(!stack.isEmpty())
            isBalancedStatus = false;

        return isBalancedStatus;
        
    }
}