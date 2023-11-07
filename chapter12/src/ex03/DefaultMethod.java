package ex03;
//인터페이스는 구현되지 않은 다양한 기능들의 집합
//interface is set of not implements skills
interface A{
  void abc();
  default void bcd() {
    System.out.println("A interface's bcd()");
  };
}

class B implements A{
  @Override
  public void abc() {
    System.out.println("B class's abc()");
  }
}

class C implements A{
  @Override
  public void abc() {
    System.out.println("C class's abc()");
  }
}

public class DefaultMethod {
  public static void main(String[] args) {
    A a1 = new B();
    A a2 = new C();

    a1.abc();
    a1.bcd(); //bcd()는 부모가 준 디폴트 메서드. bcd() is default method from parents class
    a2.abc();
    a2.bcd();
  }
}
