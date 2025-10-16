public class HouseKeeping implements HotelService {
    private int roomNumber;

    public HouseKeeping(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void cleanRoom(int roomNumber) {
        System.out.println("Housekeeping is cleaning room number: " + roomNumber);
    }

    @Override
    public void performService() {
        cleanRoom(roomNumber);
    }
}
