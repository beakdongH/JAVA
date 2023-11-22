package ex02;

import java.io.IOException;
import java.io.InputStreamReader;

//예외가 발생할 가능성이 있는 문장들을 중괄호로 묶어서 예외처리를 해줘야한다
//have possibility of exception sentences, exception handling by middle braket
//예외처리 하는 방법 2가지 / 2 ways to exception handling
//1.try-catch로 묶기(내가 직접 책임지겠다) / tied try-catch (buck itself)
//2.throws 던지기(나를 호출한 쪽에 책임전가) / throw 'throws' (passing the buck to call)
//try{}에는 예외발생 가능성이 있는 문장들을 적는 곳 / try{} : write possibility of exception handling
//catch{}에는 try{}에서 만약 발생했다면 처리하는 차선책이 적히는 곳 / write second best when try{} have exception
//만약 try{}에서 예외가 발생 안했으면 catch는 실행 안된다. / if try{} doesn't occur in try{}, catch isn't run
//finally에는 try와 catch에서 공통적으로 수행되는 명령들을 적는다 / write in finally, are commonly run in try and catch
public class TryCatchFinally {
  public static void main(String[] args)  {
    System.out.println("Before delay");
    try {
      Thread.sleep(1000);
    }
    catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
    System.out.println("After delay");

    //forName 안에 있는 클래스를 JVM이 메모리로 올려서 객체하나를 반환하는 명령
    //JVM to load the class in forName into memory and return an object
    try {
      Class cals = Class.forName("java.lang.Object");
    }
    catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
    InputStreamReader in = new InputStreamReader(System.in);
    try {
      in.read();
    }
    catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
