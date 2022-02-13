package OOP.test3.problem_1;

public class OtherClass {
    private int x;

    public OtherClass() {
    }

    public OtherClass(int x) {
        this.x = x;
    }

    public static void main(String[] args) {
        OtherClass otherClass = new OtherClass();
        System.out.println(otherClass.x);
    }
}
