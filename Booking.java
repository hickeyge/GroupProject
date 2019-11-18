
package GroupProject;

public class Booking {
    
    public Room bookedRoom;
    public Guest bookingGuest;
    public int bookingYear;
    public int checkInDay;
    public int checkOutDay;
    public int bookingID;
    
    public static int nextID;
    
    public Booking(Guest bookingGuest, Room bookedRoom, int year,
                   int checkIn, int checkOut){
    this.bookingGuest = bookingGuest;
    this.bookedRoom = bookedRoom;
    this.bookingYear = year;
    this.checkInDay = checkIn;
    this.checkOutDay = checkOut;
    this.bookingID = nextID++;
    bookedRoom.bookRoom(); //could return false but were not checking
    }
   
   public void endBooking(){
       //maybe set checkOutDay to today?
   }
    
}
