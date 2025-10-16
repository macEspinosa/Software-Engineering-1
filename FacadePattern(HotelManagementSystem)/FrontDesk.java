public class FrontDesk {
    public void requestValet(String plateNumber) {
        Valet valet = new Valet(plateNumber);
        valet.performService();
    }

    public void requestCleaning(int roomNumber) {
        HouseKeeping hk = new HouseKeeping(roomNumber);
        hk.performService();
    }

    public void requestCart(int numberOfCarts) {
        Cart cart = new Cart(numberOfCarts);
        cart.performService();
    }
}
