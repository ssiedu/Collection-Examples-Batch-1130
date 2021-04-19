
import java.util.LinkedList;


public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.add("indore");
        list.add("bhopal");
        list.add("chennai");
        System.out.println(list);
        list.addFirst("mumbai");
        System.out.println(list);
        list.addLast("pune");
        System.out.println(list);
        list.add(1,"nagpur");
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        
    }
}
