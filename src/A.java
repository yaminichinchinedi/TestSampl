public class A {
    public static void main(String args[]){

        C c1 = new C();
        c1.display();

        A a1 = new D();
        a1.display();
        a1.hello();



        D d1 = new D();
        d1.display();
        d1.world();
        d1.hello();



    }
    static void display() {
        System.out.println("A");
    }
    static void hello() {System.out.println("A");}
}
