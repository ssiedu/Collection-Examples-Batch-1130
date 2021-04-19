
import java.util.Stack;


public class StackDemo {

    public static void main(String[] args) {

        Stack stk=new Stack();
        stk.push("indore");
        stk.push("delhi");
        stk.push("mumbai");
        stk.push("chennai");
        System.out.println(stk);
        stk.pop();
        System.out.println(stk);
        stk.pop();
        System.out.println(stk);
    }
}
