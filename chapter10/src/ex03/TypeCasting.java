package ex03;

//class A seems like doesn't exist Parents Class, it's automatically extends Object is top class
//Becomes Object's child
//클래스 A는 부모클래스가 없는 것 처럼 보이지만, 자동으로 extends Object 가 붙으며 최상위 클래스인
//Object의 자식이 된다
class A {
    int m =3;
    void abc(){
        System.out.println("A class");
    };
    //toString used by explain class
    //toString은 클래스를 설명하는 용도로 사용한다.
    @Override
    public String toString() {
        return "Hi I'm A class, I have method abc and field m";
    }
}

class B extends A{
    int n=4;

    @Override
    public String toString() {
        return "Hi I'm B class, I have method bcd and field n";
    }

    @Override
    void abc(){
        System.out.println("redefine A class's at B");
    }
    void bcd(){
        System.out.println("B class");
    }
}

class C extends B{
    int k=5;

    @Override
    void abc() {
        System.out.println("redefine A class's at C");
    }
    void cde(){
        System.out.println("C class");
    }
}

public class TypeCasting {
    public static void main(String[] args) {
        //If make small balloon, point out small balloon
        //작은 풍선만 만들고 작은 풍선을 가리키는 경우
        A aa = new A();
        //toString() is method from Object class
        //toString()은 Object 클래스로 부터 상속받은 메서드이다

        System.out.println(aa.toString());
        System.out.println(aa.m);
        aa.abc();

        //If make both of small,big balloon and point out small balloon
        //크고 작은 풍선 둘 다 만들고 작은 풍선을 가리키는 경우
        A bb = new B();
        System.out.println(bb.toString());
        System.out.println(aa.m);
        bb.abc();
        //Cannot be used because there is no n in the small balloon pointed to by bb.
        //bb가 가리키는 작은 풍선 안에 n이 없기 떄문에 사용 불가.
        //System.out.println(bb.n);

        //Downcasting bb that was A to B. So
        //A였던 bb를 B로 다운캐스팅했다. 즉 큰 풍선을 가리키는 것으로 바꿈
        System.out.println(((B)bb).n);
        ((B)bb).bcd();

        //If make both of small,big ballon and point out big ballon
        //크고 작은 풍선 둘 다 만들고, 큰 풍선을 가리키는 경우
        B cc = new B();
        System.out.println(cc.m);
        System.out.println(cc.n);
        cc.abc();
        cc.bcd();

    }
}
