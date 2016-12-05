package com.thegfg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DepositServlet")
public class DepositServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DepositServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
		// response.getWriter().append("Served at:
		// ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		DepositBean db = new DepositBean();
		db.setType(request.getParameter("type"));
		db.setCapital(request.getParameter("capital"));
		db.setTerm(request.getParameter("term"));
		db.setDepositDate(request.getParameter("depositDate"));
		db.setWithdrawDate(request.getParameter("withdrawDate"));
		db.start();

		out.print("<br>利息：" + db.getInterest());
		out.print("<br>总金：" + db.getcapitalAndInterest());

		/*
		 * RequestDispatcher dispatcher =
		 * request.getRequestDispatcher("index.jsp");
		 * dispatcher.forward(request, response);
		 */

	}

}
