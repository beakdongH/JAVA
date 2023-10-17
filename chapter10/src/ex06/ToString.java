package ex06;

 class A{
     private int a = 3;
     private int b = 4;

     @Override
     public String toString() {
         return "A{" +
                 "a=" + a +
                 ", b=" + b +
                 '}';
     }
 }

public class ToString {
     //It needs to write defensive code. Because m,n can't connection directly outside
     //외부에서 m과 n을 직접적으로 접근하지 못하도록 방어적 코드를 작성할 필요가 있다
    int m=3;
    int n=4;
    //Safe code must be written to access fields (data) indirectly through methods
    //간접적으로 메서드를 통해서 필드(데이터)에 접근하도록 코드를 짜야 안전한 코드

    //method bring value from m field
    //m필드에서 값을 가져오는 메서드
    public int getM(){
        return m;
    }

    //method save value at m field
    //m필드에 값을 저장하는 메서드
    public void setM(int m) {
        this.m = m;
    }

    //method save value at n field
    //n필드에 값을 저장하는 메서드
    public void setN(int n) {
        this.n = n;
    }


    //method bring value from n field
    //n필드에서 값을 가져오는 메서드
    public int getN() {
        return n;
    }

    @Override
    public String toString() {
        return "ToString{" +
                "m=" + m +
                ", n=" + n +
                '}';
    }
    //        A a = new A();
//        //hashCode() value is unique location information where the object remains in memory
//        //hashCode()값은 그 객체가 메모리에 머물러있는 고유 위치 정보
//        System.out.printf("%x\n",a.hashCode());
//
//        //toString is representative information of express the object
//        //Is there a need to include hashCode that are virtually useless in that information?
//        //toString은 그 객체를 나타내는 대표적인 정보이다
//        //그 정보에 사실상 필요없는 해시코드가 들어있을 필요가 있나?
//        System.out.println(a.toString());
 }

