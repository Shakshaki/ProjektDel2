package data;

public class Patient {
    private String Cpr;
    private String Password;

    public String getCpr()
    {
        return Cpr;
    }

    public void setCpr(String cpr) {
        Cpr = cpr;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
