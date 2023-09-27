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
