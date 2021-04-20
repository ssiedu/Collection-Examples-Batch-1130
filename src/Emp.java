public class Emp {
    private int eno;
    private String ename;
    private int sal;
    private String desg;

    public Emp(int eno, String ename, int sal, String desg) {
        this.eno = eno;
        this.ename = ename;
        this.sal = sal;
        this.desg = desg;
    }

    
    public String toString() {
        return "Emp{" + "eno=" + eno + ", ename=" + ename + ", sal=" + sal + ", desg=" + desg + '}';
    }
    
    
}
