public class MazeGame {
    Maze CreateMazeGame() {
        Maze m = new Maze();
        Room r1 = new Room(1), r2 = new Room(2);
        Door d = new Door(r1, r2);

        m.AddRoom(r1);
        m.AddRoom(r2);

        r1.SetSide(Direction.North, new Wall());
        r1.SetSide(Direction.South, new Wall());
        r1.SetSide(Direction.West, new Wall());
        r1.SetSide(Direction.East, d);

        r2.SetSide(Direction.North, new Wall());
        r2.SetSide(Direction.South, new Wall());
        r2.SetSide(Direction.East, new Wall());
        r2.SetSide(Direction.West, d);

        return m;
    }

    /**
     * it uses makeRoom() and makeDoor() instead of hardcoding
     * the subclass could override the factory method
     * @return
     */
    Maze CreateMazeGame_Rewrite() {
        Maze m = makeMaze();

        Room r1 = makeRoom(1), r2 = makeRoom(2);
        Door d = makeDoor(r1, r2);

        m.AddRoom(r1);
        m.AddRoom(r2);

        r1.SetSide(Direction.North, new Wall());
        r1.SetSide(Direction.South, new Wall());
        r1.SetSide(Direction.West, new Wall());
        r1.SetSide(Direction.East, d);

        r2.SetSide(Direction.North, new Wall());
        r2.SetSide(Direction.South, new Wall());
        r2.SetSide(Direction.East, new Wall());
        r2.SetSide(Direction.West, d);

        return m;
    }

    // factory method - each returns a maze component
    public Maze makeMaze(){
        return new Maze();
    }

    public Room makeRoom(int roomNo){
        return new Room(roomNo);
    }

    public Wall makeWall() {
        return new Wall();
    }

    public Door makeDoor(Room r1, Room r2) {
        return new Door(r1, r2);
    }
}
