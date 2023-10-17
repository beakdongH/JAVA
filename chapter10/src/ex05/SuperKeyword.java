package ex05;

class A{
    void abc() {
        System.out.println("A class's abc()");
    }
}

class B extends A{
    void bcd(){
        //super point out parents
        //super can back original shape to parents class
        //super은 부모를 가리킨다
        //super은 부모클래스를 원형으로 돌릴 수있다
        super.abc();
    }

    @Override
    void abc() {
        System.out.println("B class's abc()");
    }


}
public class SuperKeyword {
    public static void main(String[] args) {
        B bb = new B();

        bb.bcd();

    }
}
