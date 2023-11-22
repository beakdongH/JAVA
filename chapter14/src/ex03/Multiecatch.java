package ex03;

public class Multiecatch {
  public static void main(String[] args) throws ArithmeticException {
    /*try {
      System.out.println(3/0);
    }
    catch (ArithmeticException e){
      System.out.println("Number can't devide 0");
    }
    finally {
      System.out.println("Program Break");
    }
    //Integer.parseInt() : ()안에 있는 문자를 숫자로 변환시켜 줌
    //                   : words change to numbers in ()
    try {
      int num = Integer.parseInt("10A"); //이것도 실수 할 수 있는 예외 문장이다. / It's exception sentence can mistake too
      System.out.println(num);
    }
    catch(NumberFormatException e){
      System.out.println("Can't change numbers");
    }*/

    //두가지 예외처리를 한 번의 try-catch로 처리하는 방법
    try {
      System.out.println(3 / 0);
      int num = Integer.parseInt("10A"); //이것도 실수 할 수 있는 예외 문장이다. / It's exception sentence can mistake too
      System.out.println(num);

    }
    catch (NumberFormatException | ArithmeticException e){
      System.out.println("occur exception");
    }
  }
}