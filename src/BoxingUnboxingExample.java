
import java.util.Stack;


public class BoxingUnboxingExample {

    public static void main(String[] args) {

        Stack stk=new Stack();
        stk.push("abc");
        stk.push(10);   //auto-boxing
        stk.push(2.5);  //auto-boxing
        System.out.println(stk);
        Double d1=(Double)stk.pop();
        System.out.println(d1+5);   //auto-unboxing
        Integer i1=(Integer)stk.pop();
        System.out.println(i1/5);   //auto-unboxing
        
        
    }
}
