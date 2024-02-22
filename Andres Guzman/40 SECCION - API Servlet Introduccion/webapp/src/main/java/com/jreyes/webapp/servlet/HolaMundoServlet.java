package com.jreyes.webapp.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hola-mundo")
public class HolaMundoServlet extends HttpServlet {
  
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    
    out.println("<!DOCTYPE html>");
    out.println("<html lang=\"en\">");
    out.println("   <head>");
    out.println("     <meta charset+\"UTF-8\">");
    out.println("     <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
    out.println("     <title>Hola mundo Servlet</title>");
    out.println("   </head>");
    out.println("   <body>");
    out.println("     <h1>Hola Mundo</h1>");
    out.println("   </body>");
    out.println("</html>");
    out.close();
  }
}
