public class Main {
    public static void main(String[] args) {
        System.out.println("We are inside pollinator App");

        for (int i = 1; i <= 100000000; i++) {
            if (i % 1000 == 0) {
                System.out.println("Count: " + i);
                wait(10); // Wait for 10 milliseconds
            }
        }

        System.out.println("Completed counting to 100 million.");
    }

    private static void wait(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}