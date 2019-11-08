package data;

public class Patient {
    private String Cpr;
    private String Password;

    public String getCpr() {
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

    public static void main(String[]args){
        Patient test = new Patient();
        String Cpr = "0123456789";
        String Password = "testkode";
        test.setCpr(Cpr);
        test.setPassword(Password);
        System.out.println("getCpr med værdien: "+test.getCpr());
        System.out.println("getPassword med værdien: "+test.getPassword());
    }


}



