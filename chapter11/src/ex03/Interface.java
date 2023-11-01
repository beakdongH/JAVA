package ex03;
//추상 클래스는 하나 이상의 추상 메서드를 포함하고 있다
//인터페이스는 모든 메서드들이 추상 메서드다
//abstract class is include more than one abstract method
//interface is abstract methods for all methods

interface A { abstract void abc(); }
interface B { abstract void bcd(); }

class C { void abc(){}; }
class D extends C { void bcd(){}; } // 클래스가 클래스를 상속할 때 오버라이딩은 선택.
// when class extends class, overriding is choice
class E implements A {
    @Override
    public void abc() {
        System.out.println("class extends interface must be overriding like this");
        //인터페이스를 상속받은 클래스는 이런식으로 오버라이딩이 필수다
    }
}
abstract class F implements B {}
class G extends F{
    @Override
    public void bcd() {
        System.out.println("In the end, some child overriding the abstract method");
        //결국 어떤 자식이 추상메서드를 오버라이딩 시켰다
    }

}

//클래스인 내가 추상메서드를 상속받았다면 오버라이딩 시켜줘야 한다.
//왜? 일반 글래스는 추상메서드를 가질 수 없으니까
//오버라이딩 시키기 귀찮아서 자식한테 넘기고 싶으면 스스로 추상클래스로 전환되야 한다.

//the class extends abstract method, use overriding
//WHY? normal class can't be haven abstract method
//if it wants to hand it, change abstract class itself


public class Interface {
    public static void main(String[] args) {

    }
}
