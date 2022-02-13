package OOP.test3.problem_3;

public class ClassB {
    public void metoda(){
        // afiseaza a din ClassA
        ClassA a = new ClassA();
        System.out.println(a.a);
        // afiseaza b din ClassA
        System.out.println(ClassA.b);
    }
}
