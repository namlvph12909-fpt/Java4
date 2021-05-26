package com.poly.servlet;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/dang-ky")

public class DangKyServlet extends HttpServlet {
@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
	req.getRequestDispatcher("/views/DangKy/form.jsp").forward(req, resp);
}
@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
	req.setCharacterEncoding("utf-8");
	resp.setCharacterEncoding("utf-8");
	String username = req.getParameter("username");
	boolean gender = Boolean.parseBoolean(req.getParameter("gender"));
	boolean married = (req.getParameter("married") != null);
	String country = req.getParameter("country");
	String[] hobbies = req.getParameterValues("hobbies");
	System.out.println(">>username: " + username);
	System.out.println(">>gender: " + gender);
	System.out.println(">>married: " + married);
	System.out.println(">>country: " + country);
	System.out.println(">>hobbies: " + Arrays.toString(hobbies));
	req.getRequestDispatcher("/views/DangKy/result.jsp").forward(req, resp);
}
}