package JavaPrograms;

import java.util.Stack;

public class StackExample {

    public void stack1(){
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(12);
        stack.push(11);

        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.get(0));
        System.out.println(stack.pop());
        System.out.println(stack);
    }

    public void parantheses(String str){
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) =='{'|| str.charAt(i)=='(' || str.charAt(i)=='[') {
                st.push(str.charAt(i));
            } else if (!st.isEmpty() && (
                    (str.charAt(i) == ']' && st.peek()=='[' )||
                    (str.charAt(i) == '}' && st.peek()=='{' )||
                    (str.charAt(i) == ')' && st.peek()=='(' ))) {
                st.pop();
            }else {
                st.push(str.charAt(i));
            }
        }
        if (st.isEmpty()){
            System.out.println("Balanced");
        }
        else
            System.out.println("Not Balanced");
    }

    public static void main(String[] args){
        StackExample se = new StackExample();
        //se.stack1();
        se.parantheses("{([])}");
    }
}
