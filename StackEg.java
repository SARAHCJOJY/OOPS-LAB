import java.util.Stack;

public class StackEg {
    public static void main(String args[])
    {
        Stack<String> stack=new Stack<String>();
        stack.push("Apple");
        stack.push("Orange");
        stack.push("Pears");
        stack.push("Grapes");
        stack.push("Banana");
        System.out.println("Initial stack:" +stack);
        System.out.println("The element at the top of the stack:" +stack.pop());
        System.out.println("Final stack:" +stack);
        stack.remove(0);
        System.out.println("Stack elements:" +stack);
    }
}