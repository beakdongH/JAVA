package ex01;

//비디오 실행은 프로그램을 만들려고 한다. / make Video execution program
//비디오 실행은 비디오 프레인과 자막이 동시에 실행되어야 한다. / Video execute must be executing video frame and subtitle in time
//그렇다면 하나의 프로그램을 프레임, 자막 두개의 쓰레드로 구현해야 함. / So a program implement two threads to frame, subtitle
//먼저 쓰레드로 구현하지 않는 예시 / first, not implement thread
//사실 쓰레드 안써도 될것 같다. / actually, it can be using thread
//그럼 프로그램이 무조건 1개의 코어가 일한다 / so program work definitely a core
//쓰레드 2개이상 만들면 여러개의 코어한테 일을 시킬 수 있게 된다. / make work to the many cores when make two thread
//프로그램의 속도가 훨씬 향샹된다 / so program's speed is better


public class NoThread {
  public static void main(String[] args) {
    int[] frame = {1, 2, 3, 4, 5};
    String[] subtitle = {"One","Two","Three","Four","Five"};
    //프레임 출력 / print frame
    for(int i=0;i<frame.length;i++){
      System.out.println("(비디오 프레임)"+frame[i]);
      try {
        Thread.sleep(200);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }

    //자막 출력 / print subtitle
    for(int i=0;i<frame.length;i++){
      System.out.println("(자막번호)"+frame[i]);
      try {
        Thread.sleep(200);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }

  }
}
