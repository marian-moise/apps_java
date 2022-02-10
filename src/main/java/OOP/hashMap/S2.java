package OOP.hashMap;

public class S2 {
    void m(S2 obj){
        System.out.println("method is invoked");
        System.out.println(obj);
    }

    void p(){
        m(this);
        System.out.println("This is this ======== > " + this);
    }

    public static void main(String args[]){
        S2 s1 = new S2();
        s1.p();
        S2 s2 = new S2();
        s2.p();
    }

}
