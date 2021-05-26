package com.poly.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/home/index")
public class HomeServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse resp)
	throws ServletException,IOException{
		req.setAttribute("message","Chào thế giới Servlet/JSP");;
		req.getRequestDispatcher("/views/index.jsp").forward(req, resp);
	}
}