package ex01_01;

//A클래스는 public클래스 이기 때문에 다른 패키지에서 사용할 수 있다.
public class A {
    public int m=3; //public을 사용해야지만 다른 패키지에서 사용가능
    public int n=4;
    public void print(){
        System.out.println("임포트");
    }
}
