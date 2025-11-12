public class User {
    protected String username;
    protected String password;
    protected boolean loggedIn;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.loggedIn = false;
    }

    public void login() {
        try {
            loggedIn = true;
            System.out.println(username + " logged in successfully.");
        } catch (Exception e) {
            System.out.println("Error logging in: " + e.getMessage());
        }
    }

    public void logout() {
        try {
            loggedIn = false;
            System.out.println(username + " logged out.");
        } catch (Exception e) {
            System.out.println("Error logging out: " + e.getMessage());
        }
    }
}
