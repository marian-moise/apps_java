package OOP.test3.problem_2;

public class Class2 extends Class1 {
    Class2() {
        System.out.println("Class2 constructor called");
        printSomething();
    }

    public static void printSomething() {
        System.out.println("printSomething() called!!!");
    }
}
