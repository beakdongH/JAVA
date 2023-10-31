package ch05;

import java.awt.*;

public class CreateStringObject {

    public static void main(String[] args){
        //new~ 키워드 - 방을 만드는 키워드(방안에는 값이 들어감)
        //배열의 경우 배열의 실제'방'을 만드는 명령어다
        //이처럼 new~로 만든 실제'방'을 우리는 '객체'라고 부른다

        //String 객체 생성 1.
        //배열을 제외하고 제일 앞글자가 대문자로 시작하는 자료형은 모두 참조변수 자료형이다. *우리는 이를 '클래스'라고 부른다.
        String str1 = new String("안녕"); //new를 이용해 만듣 객체(방)안에 지금 '안녕'이 들어가있다
        //new로 객체를 만들었고 그 객체가 str1에 담긴다 WHY?? => str1이 참조변수니까
        //String이란 클래스로 만든 변수는 전부 참조변수이다.
        System.out.println(str1);
        System.out.println();

        //String 객체 생성 2.
        //String 객체를 만들때에도 배열 객체를 만들 때처럼 new 키워드를 생략 가능하다.
        //다만 new 키워드가 없다고 해서 객체가 만들어 지지 않는 것이 아니다.(=객체는 만들어진다)ㅌ
        String str2 = "안녕하세요";
        System.out.println(str2);











    }

}
