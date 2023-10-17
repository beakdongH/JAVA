package ex04;

class Animal{
    void cry(){};
}
class Bird extends Animal{
    @Override
    void cry() {
        System.out.println("tweet");
    }

}
class Cat extends Animal{
    @Override
    void cry() {
        System.out.println("meow");
    }

}
class Dog extends Animal{
    @Override
    void cry() {
            System.out.println("woof");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Animal aa = new Animal();
        aa.cry();
        Animal bb = new Bird();
        bb.cry();
        Animal cc = new Cat();
        cc.cry();
        Animal dd = new Dog();
        dd.cry();
        //
        //Want to manage 3 objects only ONE list
        //compiler upcasting Animal class
        //하나의 배열로 세개의 객체를 모두 관리하고 싶음!
        //컴파일러가 Animal 클래스로 업캐스팅 시켜줌

        Animal[] animals = {bb,cc,dd};

        //take out all the element to list by each-for grammar
        //each-for 문으로 배열에 있는 모든 객체를 끄집어 내기
        for(Animal animal : animals){
            animal.cry();
        }
    }
}
