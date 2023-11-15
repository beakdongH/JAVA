package ex01;

//Button 클래스 안에는 onClick()와 같은 메서드가 존재한다
//onClick()을 실행 했을 때 어떤 동작을 실행할 것 인지는 때에 따라 다르다(추상메서드로 만든다)
//귀를 기울이고 있다가(이벤트 리스너) 누군가가 setOnClickListener을 호출 했을 때
//onClick()메서드의 역할이 확실히 정해지고 누군가가 정의한 오버라이딩 대로 실행된다.
//Button class have method like onClick()
//when running onClick() depend on different what to do(make abstract method)
//when someone call setOnClickListener
//onClick() method get a role and running by someone define

class Button {
  OnClickListener ocl;
  void setOnClickListener(OnClickListener ocl){
    this.ocl = ocl;
  } //구현된 OnClickListener 인터페이스를 외부에서 받아와서 집어 넣겠다
    //get in the implemented OnClickListener interface from outside

  interface  OnClickListener{//클릭메서드가 어떤 역할을 할지 모르기 때문에 추상 메서드로 만듦
                            //made abstract method because what's role the click method
    void onClick();
  }

  void onClick(){
    ocl.onClick();
  }
}

public class ButtonAPIExample {
  public static void main(String[] args) {
    //예시 1. 클릭하면 음악 재생 / ex1. play music when a click
    Button btn1 = new Button(); //첫번째 버튼 객체 생성 / make first button object
    //빈껍데기(interface)를 new해서 바로 줄수는 없다 / Can't give it directly by new
    //빈껍데기를 구현한 어떤 자식클래스를 new로 넘겨주거나 빈껍데기(interface)를 넘겨줄 떄 중괄호 내에 동시에 구현
    //give some child class what implements interface or override both in middle braket when give interface
    btn1.setOnClickListener(new Button.OnClickListener() {
      @Override
      public void onClick() {
        System.out.println("음악 재생 중");
      }
    });
    btn1.onClick();

    Button btn2 = new Button();
    btn2.setOnClickListener(new Button.OnClickListener() {
      @Override
      public void onClick() {
        System.out.println("네이버 실행");
      }
    });
    btn2.onClick();
  }
}
