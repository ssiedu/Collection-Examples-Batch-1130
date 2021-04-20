
import java.util.Stack;


public class GenericStack {

    public static void main(String[] args) {

        Stack<Integer> stk1=new Stack<>();
        stk1.push(10); stk1.push(20);
        //stk1.push("ab"); stk1.push("xy");
        
        Stack<String> stk2=new Stack<>();
        stk2.push("ab"); stk2.push("xy");
        //stk2.push(10);  stk2.push(20);
        
        Stack stk3=new Stack();
        stk3.push(10); stk3.push(20);
        stk3.push("ab"); stk3.push("xy");
        stk3.push(2.5); stk3.push(4.5);
        
        System.out.println("Stack-1");
        System.out.println(stk1);
        System.out.println("_____________________________________________________");
        System.out.println("Stack-2");
        System.out.println(stk2);
        System.out.println("_____________________________________________________");
        System.out.println("Stack-3");
        System.out.println(stk3);
        System.out.println("_____________________________________________________");
    }
}
