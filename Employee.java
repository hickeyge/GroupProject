package GroupProject;

public class Employee {

    private int employeeID;
    private String username;
    private String password;
    private String employeeName;

    public static int nextID;

    public Employee(String username, String password,
            String employeeName) {

        this.username = username;
        this.password = password;
        this.employeeName = employeeName;
    }

    public boolean checkCredentials(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

    public String getEmployeeName() {
        return this.employeeName;
    }

    public String getUsername() {
        return this.username;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;

    }

    public int setPassword(String oldP, String newP) {
        if (this.password.equals(oldP)) {
            password = newP;
            return 1;
        }
        return 0;
    }

}
