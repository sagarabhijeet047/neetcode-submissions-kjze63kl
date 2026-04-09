class Solution {
    public boolean isValid(String s) {
        Stack<Character> balance = new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='(' || ch=='{' || ch=='['){
                balance.push(ch);
            }else {
                if(balance.isEmpty()) return false;

                char top = balance.pop();
                if(ch == ')' && top!='(') return false;
                if(ch == '}' && top!='{') return false;
                if(ch == ']' && top!='[') return false;
            }
        }
        return balance.isEmpty()?true:false;
    }
}
