public class Player {
    private String name; 

    private Room currentRoom;
    
    public Player(String name, Room room) {
        this.name=name;
        currentRoom=room;
    }

    public Player(String name) {
        this.name=name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getname(){
        return this.name;
    }

    public void exploreRoom(){
        currentRoom.inspect();
    }

}
