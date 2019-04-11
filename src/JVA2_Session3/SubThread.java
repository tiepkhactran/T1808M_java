package JVA2_Session3;

public class SubThread extends Thread {

    public void run() {

            try {
                for (int i = 10; i>=1; i--) {
                    System.out.println(i);
                    Thread.sleep(1000);
                }
                System.out.println("Happy!!!");
            } catch (Exception e) {

        }
    }
}

