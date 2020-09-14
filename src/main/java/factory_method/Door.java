package factory_method;

public class Door extends MapSite {
    private Room room1, room2;
    private boolean isOpen;

    public Door (Room r1, Room r2) {
        this.room1 = r1;
        this.room2 = r2;
    }
    void enter() {

    }
}
