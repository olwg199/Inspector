package servlets;

import entity.Question;
import entity.Topic;
import entity.dao.QuestionDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Questions", urlPatterns = {"/Questions"})
public class Questions extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ArrayList<Topic> topicList = (ArrayList<Topic>)request.getServletContext().getAttribute("TopicList");
        ArrayList<Question> questionsList = (ArrayList<Question>) QuestionDAO.getAllQuestion();
        Topic searchTopic = null;
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            for (Topic top : topicList) {
                if (top.getName().equals(request.getParameter("topic"))) {
                    searchTopic = top;
                }
            }
            
            out.println("Содержание: " + request.getParameter("topic") + "</br>");
            
//            if(searchTopic != null) {
//                for (Question quest : questionsList) {
//                    if(searchTopic.getId() == quest.getTopic().getName()){
//                        out.println("Содержание: " + quest.getContents() + "</br>");
//                    }
//                }
//            } else {
//                out.println("Вопросы по этой теме не найдены!");
//            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
