public class BombMazeGame extends MazeGame {

    public Room makeRoom(int roomNo){
        return new Room(roomNo);
    }

    public Wall makeWall() {
        return new BombedWall();
    }
}

