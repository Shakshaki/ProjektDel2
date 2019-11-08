package data;

import java.sql.*;

public class Forbindelse {
    private static Forbindelse forbindelse= new Forbindelse();

    public static void main(String[] args) throws SQLException { //psvm
        Forbindelse forbindelse = new Forbindelse();
        String cpr = "0123456789";
        forbindelse.searchUser(cpr);

    }

    private Connection connection;
    private Statement stmt;
    private String url, userName, password;
    private ResultSet userset, appointmentset = null;
    private String cpr;

    public static Forbindelse getInstance(){
        if (forbindelse==null){
            forbindelse = new Forbindelse();
        }
        return forbindelse;

    }

    private Forbindelse() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();  //indlæser driver-klasse
            url = "jdbc:mysql://192.168.239.24/?serverTimezone=UTC";
            userName = "sika";
            password = "itSMRC2019";
            connection = DriverManager.getConnection(url, userName, password);

            } catch (Exception e) {
            System.out.println("Forbindelse undtagelse: " + e.getMessage());
            e.printStackTrace();
        }

    }

    public Patient searchUser(String cpr) throws SQLException {
        if (forbindelse == null){
            forbindelse = new Forbindelse();
        }
        if (connection == null){
            System.out.println("Connection null!");
        }
        stmt = connection.createStatement();
        if (stmt==null){
            System.out.println("Statement null");
        }
        try {
            userset = stmt.executeQuery("SELECT * FROM sund.patient WHERE brugernavn="+cpr+";");
            Patient patient = new Patient();

            if (userset.next()) {
                int output = userset.getInt("brugernavn"); //skal laves til streng
                System.out.println("Bruger fundet med følgende cpr: " + output);
                //String outputstring = userset.getString("kode");
                //System.out.println("Bruger fundet med kode:" + outputstring);
                patient.setCpr(userset.getString("brugernavn")); //laver til et objekt
                patient.setPassword(userset.getString("kode"));
                return patient;

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
