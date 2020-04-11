package com.missingme;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * HelloServlet
 *
 * @Since v5.01
 * @Author amin
 * @Date 2020/4/11 8:26 上午
 */
@WebServlet("/hello")
public class HelloServlet extends HttpServlet {


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = "Spring 屌丝版";
		req.setAttribute("name",name);
		req.getRequestDispatcher("/WEB-INF/jsp/hello.jsp").forward(req,resp);

	}
}
