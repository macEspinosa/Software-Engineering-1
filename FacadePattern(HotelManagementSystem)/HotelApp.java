public class HotelApp {
    public static void main(String[] args) {
        FrontDesk frontDesk = new FrontDesk();

        frontDesk.requestValet("ABC-1234");
        frontDesk.requestCleaning(502);
        frontDesk.requestCart(2);
    }
}
