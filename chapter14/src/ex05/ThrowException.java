package ex05;


// 1.예외문장을 가지고있는 놈이 직접 try-catch() / directly try-catch() who has exception
class A{
  void abc() throws InterruptedException {
    bcd();
  }
  void bcd() throws InterruptedException {
    Thread.sleep(1000);
  }
}

class B{
  // 2.호출한 놈으로 예외를 전가할 때 throws / throws when impoute call
  void abc() {
    bcd();
  }
  void bcd() {
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }
}
public class ThrowException {
  public static void main(String[] args) {

  }
}
