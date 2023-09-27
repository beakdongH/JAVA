package ch07;

import java.util.SplittableRandom;

public class FlexibleSizeArrayArgument {
    public static void main(String[] args){
        //메서드 오버로딩을 이용해서 동일한 이름의 메서드를 다양하게 호출
        method1(1,2);
        method1(1,2,3);
        method1();

        method2("안녕","방가");
        method2("땡큐","베리","감사");
        method2();


    }
    //와 만약에 한개짜리부터 백개짜리까지 다있다면..
    //총 100가지의 시그니처를 만들어야하는거야?? 겁나 불편하네?
    //어떤 개발자가 새로운 문법을 만들었습니다.
    //이름하야 가변길이 배열 매개변수
    public static void method1(int...array){
        for(int k: array){
            System.out.print(k+" ");
        }
        System.out.println();
    }

    public static void method2(String...array){
        for(String k: array){
            System.out.print(k+" ");
        }
        System.out.println();
    }

}
