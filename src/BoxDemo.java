
public class BoxDemo {

    public static void show(Object obj) {
        System.out.println(obj);
    }

    public static void main(String[] args) {
        show("abc");
        show("xyz");
        show(5);        //show(new Integer(5));
        show(4.5);      //show(new Double(4.5));
    }
}
