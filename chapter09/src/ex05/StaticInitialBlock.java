package ex05;

class A{
    int a;
    static int b;
    //Constructor(생성자) - it usually reset a instance field.
    //static field can reset in constructor (But usually don't use it)
    A(int a){
        this.a = a;

    }
    //reset static field in static block

    static {
        b = 7;
        System.out.println("Class A is loading");
    }
}

public class StaticInitialBlock {
    public static void main(String[] args) {
        A a1 = new A(3);
        System.out.println(a1.a);
        System.out.println(A.b);
    }
}
