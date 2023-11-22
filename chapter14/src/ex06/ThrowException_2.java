package ex06;

class A{
  void ABC(){
    try {
      bcd();
    }
    catch (ClassNotFoundException | InterruptedException e){
      throw new RuntimeException(e);
    }
  }

  void bcd() throws InterruptedException, ClassNotFoundException {
    //한 메서드 안에 해결해야 할 예외처리가 두 개나 있으면 보통 던진다
    //if there are two extception handler that need to solve in a method, it's usually throw

    Class cls = Class.forName("java.lang.Object");

    Thread.sleep(1000);
  }
}

public class ThrowException_2 {
}
