package com.work;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SCServlet")
public class SCServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SCServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		// 获取参数和操作符
		String firstNum = request.getParameter("firstNum");
		String secondNum = request.getParameter("secondNum");
		String lastNum = request.getParameter("lastNum");
		String operator1 = request.getParameter("operator1");
		String operator2 = request.getParameter("operator2");
		
		if (firstNum.length() <= 0) {
			out.print("没有输入第一个参数!");
		} else if (secondNum.length() <= 0) {
			out.print("没有输入第二个参数!");
		} else if (lastNum.length() <= 0) {
			out.print("没有输入第三个参数!");
		} else {		
			// 实例化SCBean并传递参数
			SCBean sc = new SCBean();
			sc.setFirstNum(firstNum);
			sc.setSecondNum(secondNum);
			sc.setLastNum(lastNum);
			sc.setOperator1(operator1);
			sc.setOperator2(operator2);
			
			// 在输出时如果遇到负数,就会把这个数用括号括起来.
			String first = (firstNum.charAt(0)=='-') ? "("+firstNum+")" : firstNum;
			String second = (secondNum.charAt(0)=='-') ? "("+secondNum+")" :secondNum;
			String last = (lastNum.charAt(0)=='-') ? "("+lastNum+")" : lastNum;
			
			// 调用对象sc的init()方法,根据返回值作出判断
			switch (sc.init()) {
			case 0:
				out.print(first + operator1 + second + operator2 + last
						+ "=" + sc.getResult() + "<br />");
				break;
			case 1:
				out.print("除数不能为零!");
				break;
			case 2:
				out.print("模不能为零!");
				break;
			default:
				break;
			}
		}
	}
}
