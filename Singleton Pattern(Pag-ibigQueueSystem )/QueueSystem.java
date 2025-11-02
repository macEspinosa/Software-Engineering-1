public class QueueSystem {
    private static QueueSystem instance;
    private int queueNumber = 0;

    private QueueSystem() {}

    public static synchronized QueueSystem getInstance() {
        if (instance == null) {
            instance = new QueueSystem();
        }
        return instance;
    }

    public synchronized int getNextNumber() {
        return ++queueNumber;
    }

    public synchronized void resetQueue(int number) {
        queueNumber = number;
        System.out.println("Queue has been reset to: " + number);
    }

    public int getCurrentNumber() {
        return queueNumber;
    }
}
