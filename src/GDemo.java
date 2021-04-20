
public class GDemo<T> {

    public void display(T p){
        
    }
    public static void main(String[] args) {

        GDemo<Integer> ob1=new GDemo<>();
        ob1.display(10);
        
        GDemo<String> ob2=new GDemo<>();
        ob2.display("abc");
        
        GDemo<Double> ob3=new GDemo<>();
        ob3.display(5.6);
        
        GDemo ob4=new GDemo();
        ob4.display(10);
        ob4.display("abc");
        ob4.display(5.6);
        
    }
}
