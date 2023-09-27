package ch08;

//클래스에는 필드와 메서드뿐만 아니라 생성자라는 것이 존재한다.
//생성자는 new를 통해서 객체생성을 가능하게 해주는 존재이다.
//필수 요소이기 때문에 없어서는 안되며, 개발자가 생성자를 넣지 않았다면 컴파일러가 대신 넣어준다.
class A{
    int m;
    void work(){
        System.out.println(m);
    }
//    이게 바로 생성자(디폴트 생성자)이다. 컴파일러가 자동으로 넣어줄 예정
//    A() {
//
//    }
}

class B{
    int m;
    void work(){
        System.out.println(m);
    }
    //디폴트 생성자를 직접 넣어줌
    //생성자 이름은 클래스의 이름과 반드시 동일해야한다.
    B(){

    }
}

class C{
    int m;
    void work(){
        System.out.println(m);
    }
    //이런식으로 매개변수가 들어간 형태의 생성자도 정의할 수 있다.
    //단 이런 경우에 【컴파일러가 디폴트 생성자를 넣지 않는다.】
    C(int a){
        m=a;
    }
    C(){

    }//생성자 오버로딩
}
public class DefaultConstructor {
    public static void main(String[] args){
        //생성자도 객체 생성하기
        A a = new A();
        B b = new B();
        C c = new C(5); //디폴트 생성자를 선언하지 않으면 매개변수가 필요하다.
    }
}
