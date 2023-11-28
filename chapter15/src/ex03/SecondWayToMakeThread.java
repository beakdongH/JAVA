package ex03;

//첫번째 방법은 쓰레드를 곧바로 만드는 방법이었고 / first way is way to make thread direct
//두번째 방법은 러너블 인테페이스를 만든 다음에 쓰레드를 만드는 방법
//두번째 방법이 조금 더 귀찮은 방법일 수 있으나
//러너블 인터페이스에게 책임소재를 나눈다는 점에서 더 좋은 코드다
//두번째 방법 추천
class SMIFileRunnable implements Runnable{

  @Override
  public void run() {
    //내가 넣고자 하는 자막의 흐름(One~Five) / subtitle's flow what I want to
    String[] subtitle = {"One", "Two", "Three", "Four", "Five"};

    for(int i = 0; i < subtitle.length; i++){
      System.out.println(" - (자막 번호) " + subtitle[i]);
      try {
        Thread.sleep(10);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
      try {
        Thread.sleep(200);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
  }
}

class VideoFrameRunnable implements Runnable{
  @Override
  public void run() {
    int[] frame = {1, 2, 3, 4, 5};
    for (int i = 0; i < frame.length; i++) {
      System.out.println("숫자 번호 " + frame[i]);
      try {
        Thread.sleep(200);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
  }
}

public class SecondWayToMakeThread {
  public static void main(String[] args) {
    //SMI 러너블 파일 객체 생성
    Runnable smiFileRunnale = new SMIFileRunnable();
    //만든 러너블 객체를 쓰레드에게 넘겨줌
    Thread thread1 = new Thread(smiFileRunnale);
    thread1.start();

    //video 러너블 파일 객체 생성
    Runnable videoFileRunnable = new VideoFrameRunnable();
    //만든 러너블 객체를 쓰레드에게 넘겨줌
    Thread thread2 = new Thread(videoFileRunnable);
    thread2.start();
  }
}
