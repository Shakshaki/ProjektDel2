import java.io.*;

public class Tekstfil {

    public static double x = 0.0;

    public static void main(String[] args) {

        try {
            FileWriter fil = new FileWriter("fil.txt", true);
            PrintWriter ud = new PrintWriter(fil);
            ud.println("Res er: " + x);
            ud.close();
        } catch (IOException e){
        }
    }

}
