package com.demo.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        PrintWriter pw = response.getWriter();
        if(request.getParameter("username").equals("spring")&& request.getParameter("password").equals("boot")) {
            pw.println("<html> Hello, this is my first servlet<br>" +
                    "<img src='https://storage.googleapis.com/gweb-uniblog-publish-prod/images/PhotosBlogBanner_1.max-1000x1000.jpg'/> " +
                    "<center> <form action='/login' method='get'><input type='submit' value='Logout'/> </form></center></html>");
        }else{
            pw.println("<html> <center> <img src='https://macreports.com/wp-content/uploads/2019/12/facebook-login-failed.png'/> <br><br>" +
                    "<form action='/login' method='get'><input type='submit' value='Back'/> </form></center> </html>");

        }
    }

    @Override
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
        PrintWriter pw = response.getWriter();
        pw.println("Inside get method");
    }
}
