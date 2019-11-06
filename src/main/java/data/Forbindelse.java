package data;

import java.sql.*;

public class Forbindelse {

    public static void main(String[] args) { //psvm
        Forbindelse forbindelse = new Forbindelse();
        // forbindelse.updateConnection("192.168.239.24","root","groot");
        forbindelse.searchUser("0");

    }

    private Connection connection;
    private Statement stmt;
    private String url, userName, password;
    private ResultSet userset, appointmentset;
    private String cpr;


    public void updateConnection(String newUrl, String newUsername, String newPassword) {

        url = "jdbc:mysql://" + newUrl + ":3306/?user=" + newUsername;
        userName = newUsername;
        password = newPassword;

        try {
            connection = DriverManager.getConnection(url, userName, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Forbindelse() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();  //indlæser driver-klasse
            url = "jdbc:mysql://192.168.239.24";
            userName = "sika";
            password = "itSMRC2019";
            connection = DriverManager.getConnection(url, userName, password);

            if (connection != null) {
                System.out.println("data.Forbindelse til databasen");
            }

            assert connection != null;
            stmt = connection.createStatement();

        } catch (Exception e) {
            System.out.println("data.Forbindelse undtagelse: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public Patient searchUser(String cpr) {

        try {
            userset = stmt.executeQuery("SELECT * FROM sund.patient where brugernavn=" + cpr + ";");
            Patient patient = new Patient();
            if (userset.next()) {
                int output = userset.getInt("cpr");
                System.out.println("Bruger fundet med cpr:" + output);
                patient.setCpr(userset.getString("cpr")); //laver til et objekt
                patient.setPassword(userset.getString("kode"));
                return patient;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void searchAppointment() {


    }
}