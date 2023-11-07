package ex02;

interface A{
  int a=3;
  void abc(); //추상메서드. abstract method.

}
//만약 class B를 정의하는 것이 귀찮다면? (if bothering define class B)
//B를 정의 안하고 바로 new 객체 만들 수 없을까?(how can I create object non define B?)
class B implements A{
  @Override
  public void abc() {
    System.out.println("B override"); //B가 책임지고 오버라이딩했다.
  }
}


public class CreateObjectOfInterface {
  public static void main(String[] args) {
    //A a1 = new A(); //인터페이스는 곧바로 new해서 객체생성할 수 없다 interface can't create object right away
    //구체적인 놈만(클래스)만 new해서 객체를 생성할 수 없다
    //can't create object by new only class
    A a1 = new A() {
      //익명 이너 클래스 Anonymous inner class
      @Override
      public void abc() {
        System.out.println("can override here");//여기서 오버라이딩 가능하다
      }
    };

    A b1 = new B(); //B클래스를 정의하는 것이 귀찮았지만 위에서 한번만 정의해주면 이후는 new만 적어주면 된다
    A b2 = new B(); //Bothering to define B class, but can use 'new' after define just one
    A b3 = new B();





    System.out.println(a1.a);
    a1.abc();
  }
}
