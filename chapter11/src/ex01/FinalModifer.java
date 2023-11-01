package ex01;
//final은 필드,메서드,클래스 앞에 붙을 수 있다.
//final 필드는 최초로 선언시 값을 반드시 저장해야 하며, 그 이후에 변경이 불가하다.
//final 메서드는 자식이 오버라이딩 시킬 수 없다
//final 클래스는 다른 클래스가 더 이상 상속할 수 없다

//final is able to added front of field, method, class
//final field necessarily save at the first time, can't change later
//final method can't be overriding by child
//final class can't be more extends by other class

class A{
    int a=3;
    final int b=5;
    void abc(){};
    final void bcd() {}
}

class B extends A{
    //@Override
    //void bcd(){}; final 메서드는 자식이 오버라이딩 할 수 없다. final method can't be overriding by child
    void abc() {
        super.abc();
    }
}

final class C{}

//class D extends C final 클래스는 더 이상 상속할 수 없다.  final class can't be extends more

public class FinalModifer {
    public static void main(String[] args) {
        A a = new A();
        a.a=10;
        //a.b =20; final field unchange - final필드는 변경 불가


    }
}
