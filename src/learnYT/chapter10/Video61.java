package chapter10;

public class Video61 extends Thread {

    public void run() {
        System.out.println("STARTING THREAD");
        long sum = 0L;
        for (long i = 0L; i < 1000000L; i++) {
            sum += i;
        }
        System.out.println("END THREAD");
    }

    public static void main(String[] args) {

        int MAX = 2;
        for (int i = 0; i < MAX; i++) {
            (new Video61()).start();
        }
        System.out.println("================================================");
    }
}
