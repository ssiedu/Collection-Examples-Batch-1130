
public class Demo {

    public static int[] compute(int number){
        int square=number*number;
        int cube=square*number;
        int data[]={square,cube};
        return data;
    }
    public static void main(String[] args) {

        int res[]=compute(10);    //and we want the compute method to return us square and cube of given number.
        System.out.println(res[0]);
        System.out.println(res[1]);
    }
}
