//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//
//Dele af koden er hentet fra en forelæsning omkring dynamiske hjemmesider:
//https://docs.google.com/document/d/1uawRw_XZX5lFGiBvJvWhzVWKqFwz6NZIBrQsG4KUDEQ/edit//

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello/")
public class TestServlet extends HttpServlet {

    private Forbindelse forbindelse = new Forbindelse();

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            resp.getWriter().write("Hej!" + req.getRequestURI());
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("1");
        String inputBruger = req.getParameter("username"); //henter parameter fra brugernavn-indtastningsfeltet i indexfilen
        System.out.println("2");
        String inputPassword = req.getParameter("password"); //henter parameter fra password-indtastningsfeltet i indexfilen
        System.out.println("3");
        System.out.println(inputBruger); //printer det indtastede brugernavn i output
        System.out.println((inputPassword)); //printer det indtastede password i output
        resp.sendRedirect("/" +"?username=" + inputBruger); //det indtastede brugernavn vises på hjemmesiden og i urlen
        //forbindelse.


    }
}
