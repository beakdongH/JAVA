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
