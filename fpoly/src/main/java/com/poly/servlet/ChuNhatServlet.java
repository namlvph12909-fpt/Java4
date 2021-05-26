package com.poly.servlet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/chunhat.php")
public class ChuNhatServlet extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	throws ServletException, IOException {
	req.getRequestDispatcher("/views/ChuNhat/form-chu-nhat.jsp").forward(req, resp);
	}
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp)
	throws ServletException, IOException {
	String dai = req.getParameter("chieudai");
	double x= Double.parseDouble(dai);
	String rong= req.getParameter("chieurong");
	double y= Double.parseDouble(rong);
	req.setAttribute("chuvi", "Chu vi là: " + (x+y)/2);
	req.setAttribute("dientich", "Diện tích là: " + x*y);
	req.getRequestDispatcher("/views/ChuNhat/ket-qua.jsp").forward(req, resp);
	}
	}