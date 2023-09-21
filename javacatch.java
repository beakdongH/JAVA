package ch01;

class A{
    //필드 정의 : A라는 클래스 내에서 마음대로 사용 가능
    int m=3;
    int n=4;

    //메서드 정의 : work1에서 정의한 k는 work1에서만 사용 가능(지역변수)
    void work1(){
        int k=5;
        System.out.println(k);
        work2(6);
    }
    void work2(int i){
        int j=4;
        System.out.println(i+j);
        //System.out.println(k); work 1 안에서만 가능

    }
}



public class FieldComponent {
    public static void main(String[] args){
        //클래스를 이용해서 객체 생성
        A var = new A();

        //필드값을 출력
        System.out.println(var.m);
        System.out.println(var.n);

        //메서드 호출
        var.work1();
    }
}

package ch02;

class A{
    //다양한 필드 정의(초기화는 안 시켰다. 과연 어떤 값들이 들어있을까?)
    boolean m1;
    int m2;
    double m3;
    String m4;

    //초기화 안 시킨 필드들을 출력해주는 메서드
    void printFieldValue(){
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        System.out.println(m4);
    }

    void printLocalVaribale(){
        //얘는 필드가 아니라 지역변수다
        int k = 10;
        System.out.println(k);
    }
}

public class InitialValue {
    public static void main(String[] args){
        A a = new A();
        a.printFieldValue();
        //어라? 출력이 잘 되네?
        //아하 필드는 컴파일러가 자동으로 초기화 시켜주는구나!

        a.printLocalVaribale();
        //초기화 하지 않은 지역변수는 출력이 안되네?
        //아하 지역변수는 필드와 다르게 초기화를 반드시 시켜줘야 하는구나!
    }
}


package ch01;

class A{
    //필드 정의 : A라는 클래스 내에서 마음대로 사용 가능
    int m=3;
    int n=4;

    //메서드 정의 : work1에서 정의한 k는 work1에서만 사용 가능(지역변수)
    void work1(){
        int k=5;
        System.out.println(k);
        work2(6);
    }
    void work2(int i){
        int j=4;
        System.out.println(i+j);
        //System.out.println(k); work 1 안에서만 가능

    }
}

public class FieldComponent {
    public static void main(String[] args){
        //클래스를 이용해서 객체 생성
        A var = new A();

        //필드값을 출력
        System.out.println(var.m);
        System.out.println(var.n);

        //메서드 호출
        var.work1();
    }
}

package ch03;

import java.util.Arrays;

public class ArrayArgumentMethod {
    public static void main(String[] args){
        int [] array = new int[] {1,2,3};
        printArray(array);
        printArray(new int[]{4,5,6});
        //new로 객체를 안만들고 바로 값을 전달하는 것은 불가능
        //printArray({7,8,9);

        //아래는 한줄에 다 적었으므로 컴파일러가 new를 자동으로 붙여준다.
        int[] array2 = {10,11,12};
        printArray(array2);


    }

    public static void printArray(int[] a){
        System.out.println(Arrays.toString(a));
    }
}


package ch04;

public class EffectOfPrimaryArgument {
    public static void main(String[] args){
        int a=3;
        int result1 = twice(3);
        System.out.println(result1);
        int result2 = twice(a);
        System.out.println(result2);
        System.out.println(a);

        //다른다라의 메서드에 있는 a와 우리 메서드 a는 서로 다른 a이므로 바뀌지 않았다.
        //call by value 예시 : 변수의 주소가 아닌 값만 딱 전달하는 예시

    }
    public static int twice(int a){
        a = a*2;
        return a;

    }

}

package ch05;

import java.lang.reflect.Array;
import java.util.Arrays;

public class EffectOfReferenceArgument {
    public static void main(String[] args){
        int[] a = new int[] {1,2,3};
        System.out.println(Arrays.toString(a));
        twice(a);
        System.out.println(Arrays.toString(a));
        //call by reference 예시 : 값을 전달한 것이 아닌 주소를 전달했기 때문에
        //main 메서드의 a와 twice 메서드의 a는 같은 배열 이므록 같이 값이 바뀌었다

    }

    public static void twice(int[] a){
        for(int i=0;i<a.length;i++){
            a[i] = a[i] * 2;
        }
    }
}


package ch06;

public class MethodOverloading {
    public static void main(String[] args){
        print();
    }

    public static void print(){
        System.out.println("데이터가 없습니다");
    }

    public static void print(int a){
        System.out.println("1234");
    }

    public static void print(double a){
        System.out.println("5678");
    }
//    바로 위의 것과 메서드 시그니쳐가 똑같기 때문에 정의 불가능.
//    public static void print(double d){
//        System.out.println("d5678");
//}
    public static void print(int a, int b){
        System.out.println("1234");
    }
    //메서드 시그니쳐가 다르다는 것은 이름은 똑같지만 매개변수의종류나 숫자가 다름을 의미

//    public static int print(int a, int b){
//        System.out.println("1234");
//        return a;
//    }
    //반환형이 다르다는 것은 호출할 떄 헷갈리기 때문에 시그니쳐가 같다라고 할 수 있다.
}


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

