package ex02;

//Abstract : 추상적인
//만약 클래스 내의 메서드 중에서 하나라도 abstract 메서드가 존재한다면, 그 클래스는 반드시 Abstract class 로 선언해야 한다.
//if any method in the classes exist, the class must be decleared Abstract class

//abstract 메서드는 아직 기능을 정의하지 않은 메서드
// ? 그럼 그 기능을 누가 언제 정의하는데?
//어떤  자식이 상속하면서 정의해야함

//abstract method : undefined skill method yet
// ? what defined it
//some child defined to extends


abstract class Animal{
    abstract void cry(); //cry()를 완성하지 않은 것은 아니다. 역할 : 아무것도 안하기/
    // Not a complete cry() Role : Do nothing

}

class Cat extends Animal{
    @Override
    void cry() {
        System.out.println("Meow");
    }
}

class Dog extends Animal{
    @Override
    void cry() {
        System.out.println("Bow-wow");
    }
}


public class AbstractModifier {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        cat.cry();
        dog.cry();
    }

}
