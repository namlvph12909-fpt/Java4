package com.poly.servlet;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HitCounterServlet")
public class HitCounterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public HitCounterServlet() {
        super();

    }
    int count;
    Path path= Paths.get("c:/temp/count.txt");
	public void init(ServletConfig config) throws ServletException {
		try {
			count = Integer.parseInt(Files.readAllLines(path).get(0));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public void destroy() {
		try {
			Files.write(path, String.valueOf(count).getBytes(),StandardOpenOption.WRITE);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		count++;
		req.setAttribute("count", count);
		req.getRequestDispatcher("/views/hit-counter.jsp").forward(req, resp);
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
