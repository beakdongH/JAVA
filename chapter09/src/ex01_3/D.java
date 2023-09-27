package ex01_3;

import ex01_1.A;

//D extends A를 했다는 것은 A가 부모 클래스, D가 A을 자식클래스로 사용하겠다.
//D가 A의 자식이 되는 순간 A의 필드 메서드가 D의 모두 복사가 된다.
//extends를 하는 순간 D는 A에게 복제된 클래스가 되므로 굳이 new A를 사용할 필요가 없다
public class D extends A{
    public void print(){
        //자식 클래스에서는 public과 더불어 protected까지 사용가능하다.
        System.out.print(a+" ");
        System.out.print(b+" ");
//        System.out.print(c+" ");  (default, private는 사용불가능)
//        System.out.print(d+" ");
        System.out.println();

    }
}
