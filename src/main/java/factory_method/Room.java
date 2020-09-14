package factory_method;

public class Room extends MapSite {
    private MapSite[] sites = new MapSite[4];
    private int roomNo;

    public Room(int roomNo) {
        this.roomNo = roomNo;
    }

    MapSite getSide(Direction direction) {
        switch (direction) {
            case North:
                return sites[0];
            case South:
                return sites[1];
            case West:
                return sites[2];
            case East:
                return sites[3];
            default:
                throw new IllegalStateException("Unexpected value: " + direction);
        }
    }

    void SetSide(Direction direction, MapSite site) {
        switch (direction) {
            case North:
                sites[0] = site;
                break;
            case South:
                sites[1] = site;
                break;
            case West:
                sites[2] = site;
                break;
            case East:
                sites[3] = site;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + direction);
        }
    }

    void enter() {

    }
}
