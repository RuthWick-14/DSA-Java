package bank;

class Account{
    public String username;
    protected String email;
    private String password;

    //getter and setter // it can use to find info in private objects
    //getter
    public String getPassword(){
        return this.password;
    }

    //setter
    public void setPassword(String pass){
        this.password = pass;
    }
}


public class packages {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.username = "Ruthvik";
        a1.email = "abcd@email.com";
        // a1.password = "abcd"; //not visible due to private
        a1.setPassword("abcd");
        a1.getPassword();
    }
}
