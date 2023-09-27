package ex01_02;

import ex01_01.A;   //다른 파일을 사용할려면 import를 사용해야한다

public class PackageImport {
    public static void main(String[] args){
        A a =new A();
        a.print();

    }
}
