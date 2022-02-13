package OOP.test3.problem_1;

public class MyClass {
    private int a = 9;
    public StringBuffer b;

    public MyClass(int j) {
        a = j;
        b = new StringBuffer(j);
    }

    public static void main(String[] args) {
        MyClass mc = new MyClass(1);

        String abc = mc.b.toString();

        System.out.println(mc.a);

        OtherClass otherClass = new OtherClass(55);
    }
}
