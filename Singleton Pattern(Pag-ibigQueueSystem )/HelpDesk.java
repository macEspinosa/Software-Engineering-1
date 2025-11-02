public class HelpDesk {
    private int deskId;

    public HelpDesk(int id) {
        this.deskId = id;
    }

    public void serveNext() {
        QueueSystem queue = QueueSystem.getInstance();
        int number = queue.getNextNumber();
        System.out.println("Help Desk " + deskId + " is now serving customer #" + number);
    }

    public void resetQueue(int number) {
        QueueSystem.getInstance().resetQueue(number);
        System.out.println("Help Desk " + deskId + " requested to reset the queue.");
    }
}
