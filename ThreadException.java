// ThreadOne class extending Thread
class ThreadOne extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                System.out.println("Thread One: " + i);
                Thread.sleep(500);  // pause for 0.5 seconds
            } catch (InterruptedException e) {
                System.out.println("ThreadOne Interrupted: " + e.getMessage());
            }
        }
    }
}

// ThreadTwo class extending Thread
class ThreadTwo extends Thread {
    public void run() {
        for (int i = 5; i >= 1; i--) {
            try {
                System.out.println("Thread Two: " + (10 / (i - 3)));  // will throw exception when i == 3
                Thread.sleep(500);
            } catch (ArithmeticException e) {
                System.out.println("Exception in ThreadTwo: Division by zero.");
            } catch (InterruptedException e) {
                System.out.println("ThreadTwo Interrupted: " + e.getMessage());
            }
        }
    }
}

// Main class
public class ThreadException {
    public static void main(String[] args) {
        ThreadOne t1 = new ThreadOne();
        ThreadTwo t2 = new ThreadTwo();

        t1.start();
        t2.start();
    }
}
