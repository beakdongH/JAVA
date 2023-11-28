public class ThirdWayToMakeThread {
  public static void main(String[] args) {
    Thread thread1 = new Thread(new Runnable() {
      @Override
      public void run() {
        String[] subtitle = {"One", "Two", "Three", "Four", "Five"};

        for (int i = 0; i < subtitle.length; i++) {
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
    });

    Thread thread2 = new Thread(new Runnable() {
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
    });

    // thread2를 먼저 시작 / start thread2 first
    thread2.start();



    // thread1 시작 / start thread1
    thread1.start();
  }
}
