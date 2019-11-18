
package GroupProject;

public class Guest {
    
    private int guestID;
    private String username;
    private String password;
    private String guestName;
   
    public static int nextID = 1;
    
    public Guest(String username, String password, String guestName){
        
        this.username = username;
        this.password = password;
        this.guestName = guestName;
    }
    
    public boolean checkCredentials(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }
    
    public String getGuestName(){
        return this.guestName;
    }
    
    public String getUsername(){
        return this.username;
    }
    
    public void setGuestName(String guestName){
        this.guestName = guestName;
    }
    
    public int setPassword(String oldP, String newP){
        return 0;
    }
    
    
    
    
}
