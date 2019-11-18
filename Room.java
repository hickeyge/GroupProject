package GroupProject;

public class Room {

    public int bedOption;
    public int kitchenOption;
    public int coffeeOption;
    public int accessibleOption;
    public int roomNumber;
    private int roomID;
    private int roomBookQuantity;
    private boolean roomBooked;
    public double roomCostPerNight;

    public static int nextID = 1;

    public Room(int bed, int kitch, int coffee, int accessibility,
            int roomNumber) {

        this.roomID = nextID++;
        this.bedOption = bed;
        this.kitchenOption = kitch;
        this.coffeeOption = coffee;
        this.accessibleOption = accessibility;
        this.roomNumber = roomNumber;
        this.roomBookQuantity = 0;
        this.roomBooked = false;
        this.roomCostPerNight = 200; //assumption
    }

    public boolean bookRoom() {
        if (roomBooked) {
            return false;
        } else {
            roomBooked = true;
            roomBookQuantity++;
            return true;
        }
    }

    public void freeThisRoom() {
        roomBooked = false;
    }

    public int getRoomBookedQuantity() {
        return this.roomBookQuantity;
    }

    public int getRoomID() {
        return this.roomID;
    }

    public String roomAnalytics() {
        String returnString = "";
        returnString += "\n Room Analytics \n";
        returnString += "==============================";
        returnString += "Room Number: " + this.roomNumber;
        returnString += ", Number of Times Booked: " + this.roomBookQuantity;
        returnString += ", Currently Booked?: " + this.roomBooked;

        return returnString;
    }

}
