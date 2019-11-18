
package GroupProject;

public class ValueGuest extends Guest {
    
    private String savingsNumber;
    private int numberOfBookings;
    private double amountSpentWithHotel;
    

    public ValueGuest(String username, String password, String guestName) {
        super(username, password, guestName);
        this.savingsNumber = "" + nextID++;
        this.numberOfBookings = 0;
        this.amountSpentWithHotel = 0;
    }

    public String getSavingsNumber() {
        return savingsNumber;
    }

    public int getNumberOfBookings() {
        return numberOfBookings;
    }

    public double getAmountSpentWithHotel() {
        return amountSpentWithHotel;
    }

    }
    

