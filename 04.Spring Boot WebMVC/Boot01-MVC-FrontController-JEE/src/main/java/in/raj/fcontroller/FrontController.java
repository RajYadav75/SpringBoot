package in.raj.fcontroller;

import in.raj.controller.LinkHandler;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/")
public class FrontController extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException {
        //perform navigation management
        String lvn = null;
        if (req.getServletPath().equalsIgnoreCase("/wish")){
            LinkHandler handler = new LinkHandler();
            lvn = handler.showWishMessage(req);
        } else if (req.getServletPath().equalsIgnoreCase("/lang")) {
            LinkHandler handler = new LinkHandler();
           lvn =  handler.showAllLanguage(req);
        }
        else {
            lvn= "welcome";
        }
        //perform view management
        String targetPage = null;
        if(lvn.equalsIgnoreCase("wish_page")){
            targetPage="/showWishMsg.jsp";
        } else if (lvn.equalsIgnoreCase("all_lang")) {
            targetPage = "/showAllLang.jsp";
        }
        else{
            targetPage="/index.jsp";
        }
        //perform RequestDispatching to  target page
        RequestDispatcher dispatcher = req.getRequestDispatcher(targetPage);
        dispatcher.forward(req,res);


    }
    public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
        doGet(req,res);
    }

}
