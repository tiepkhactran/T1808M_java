package baitap3;

public class Subthread extends Thread {

    public void run() {

        try {
            for (int i = 1; i <= 50; i++) {
                System.out.println(i);
            }

            System.out.println("Happy!!!");
        } catch (Exception e) {

        }
    }

}

