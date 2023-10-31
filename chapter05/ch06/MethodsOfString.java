package ch06;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MethodsOfString {

    public static void main(String[] args){
        //대문자를 소문자로, 소문자를 대문자로 바꿔주는 메서드(Method(메서드) - Functuion 즉, 함수를 의미)
        String str1 = "Java Study";
        System.out.println(str1.toLowerCase()); //모든 문자를 소문자로 변환
        System.out.println(str1.toUpperCase()); //모든 문자를 대문자로 변환

        //문자열 안에 있는 내용을 바꿔주는 메서드
        System.out.println(str1.replace("Study","공부"));

        //문자열을 잘라주는 메서드
        //(0,5) -> 0 인덱스 부터 7-1(6)까지 잘라줌
        System.out.println(str1.substring(0,7));

        //문자열을 구분자를 이용해서 여러개로 나눠주는 메서드
        String[] strArray = "abc/def-ghi jkl".split("/|-| ");//함수 안 따옴표 안의 내용을 기준으로 자른다(ㅣ구분)
        System.out.println(Arrays.toString(strArray));

        //문자열의 앞 뒤로 공백을 모두 제거해주는 메서드
        System.out.println("          abc              ".trim());

        //문자열의 내용을 비교
        String str2 = new String("Java");
        String str3 = new String("Java");
        String str4 = new String("java");

        //세 변수 모두 객체의 주소들은 모두 다르다
        //왜냐하면 new를 이용해 항상 새로운 객체(방)을 만들었기 때문이다.
        // == 은 주소를 비교하고, str2,3,4는 각각 주소가 다르기에 false가 출력된다
        System.out.println(str2 == str3);
        System.out.println(str3 == str4);
        System.out.println(str2 == str4);
        System.out.println();

        //객체의 주소를 비교하지 말고 객체안에 있는 내용을 비교하고 싶다면?
        System.out.println(str2.equals(str3));
        System.out.println(str3.equals(str4));
        System.out.println(str3.equalsIgnoreCase(str4)); //대소문자를 무시하고 안에 있는 내용을 비교하는 메서드

    }
}
