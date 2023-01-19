package ua.edu.sumdu;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CalculateStats extends HttpServlet {

    protected void processRequest (HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession session = request.getSession();
        List<Student> students = (List<Student>) session.getAttribute("students");

        StatsCalculator stat =  StatsCalculator.getInstance();
        stat.setMeanAge(Utils.calculateMeanAge((LinkedList<Student>) students));
        try {
            stat.setPopularMail(Utils.calculatePopularDomain((LinkedList<Student>) students));
        } catch (EmailExeption ex) {
            Logger.getLogger(CalculateStats.class.getName()).log(Level.SEVERE, null, ex);
        }
        session.setAttribute("stat", stat);
        response.sendRedirect("statistics.jsp");
    }
}
