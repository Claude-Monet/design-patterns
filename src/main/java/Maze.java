import java.util.ArrayList;
import java.util.List;

public class Maze {
    private List<Room> rooms;

    public Maze(){
        rooms = new ArrayList<Room>();
    }

    void AddRoom(Room room) {
        rooms.add(room);
    }
}
