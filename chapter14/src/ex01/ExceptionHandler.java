package ex01;

//예외처리를 하는 방법 : try-catch-finally구문 활용
//How to exception handling : use try-catch-finally
//try{} : 예외가 발생할 가능성이 있는 구문들을 적는 곳
//catch{} : try{}에서 실제로 예외가 발생 했다면 실행되는 차선책 들이 적히는 곳
//finally{} : try{}와 catch{}에서 공통적으로 실행되는 문장을 적는곳, 보통 리소스들을 반납할 때 쓰인다.

//try{} : write a possibility to except
//catch{} : happened exception in try{}, write running next best
//finally{} : write running both of try{} and catch{}. usually use back the resource

//차선책이 뭐야? 해당 예외에 적절한 클래스들을 적어주는 것
//what a second best? write right classes at the exception

public class ExceptionHandler {
  public static void main(String[] args) {
    try{
      System.out.println(3/0);
    }

    catch (ArithmeticException e){
      System.out.println("Number can't devide 0");
    }

    finally {
      System.out.println("Exit");
    }
    //parseInt : 문자열을 숫자로 변경 / change string -> number
    try {
      int n = Integer.parseInt("10A");
      System.out.println(n);
    }
    catch (NumberFormatException e){
      System.out.println("'A' isn't number");
    }
    finally {
      System.out.println("Exit");
    }
  }

}
