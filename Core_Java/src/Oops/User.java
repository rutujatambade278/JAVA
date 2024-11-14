package Oops;

public class User {
    public void login() {
        // Generic login
    }
}

 class Admin extends User {
    @Override
    public void login() {
        
    }
}

 class Customer extends User {
    @Override
    public void login() {
      
    }
}
