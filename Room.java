public class Room {
    // Field to store the description of the room
    private String description;

    // Constructor to initialize the room with a description
    public Room(String description) {
        this.description = description;
    }

    // Method to inspect the room and print its description
    public void inspect() {
        System.out.println(description);
    }
}
