package ex02;
//자막을 출력하는 쓰레드 / print subtitle thread
class SMIFileThread extends Thread{
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
//비디오 프레임을 출력하는 쓰레드 / print video frame thread
class VideoFileThread extends Thread{
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


public class FirstWayToMakeThread {
  public static void main(String[] args) {
    // 두 개의 쓰레드를 동시에 실행 / run two threads simultaneously

    // VideoFileThread 먼저 시작 / start VideoFileThread first
    Thread videoFileThread = new VideoFileThread();
    //생성된 객체로 쓰레드 실행 / run by thread
    videoFileThread.start();

    // SMIFileThread 시작 / start SMIFileThread
    Thread smiFileThread = new SMIFileThread();
    //생성된 객체로 쓰레드 실행 / run by thread
    smiFileThread.start();
  }
}
