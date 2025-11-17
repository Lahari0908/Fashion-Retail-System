package model;

public class Admin extends User {
    public Admin(String email, String password) {
        super(email, password);
    }

    public void manageInventory() {
        System.out.println("Admin " + getEmail() + " is managing inventory");
    }
}
