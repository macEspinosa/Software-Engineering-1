public class PagIbigQueueSystemDemo {
    public static void main(String[] args) {
        HelpDesk desk1 = new HelpDesk(1);
        HelpDesk desk2 = new HelpDesk(2);
        HelpDesk desk3 = new HelpDesk(3);

        desk1.serveNext();
        desk2.serveNext();
        desk3.serveNext();

        System.out.println("---- Resetting queue ----");
        desk1.resetQueue(100);

        desk2.serveNext();
        desk3.serveNext();
    }
}
