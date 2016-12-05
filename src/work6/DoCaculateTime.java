package work6;


import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class DoCaculateTimeGep
 */
@WebServlet("/DoCaculateTime")
public class DoCaculateTime extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoCaculateTime() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		String date1=request.getParameter("date1");
		String time1=request.getParameter("time1");
		String date2=request.getParameter("date2");
		String time2=request.getParameter("time2");
		Calendar calendar=Calendar.getInstance();
		String []date=date1.split("-");
		String []time=time1.split(":");
		calendar.clear();
		calendar.set(Integer.parseInt(date[0]), Integer.parseInt(date[1]), Integer.parseInt(date[2]), Integer.parseInt(time[0]),Integer.parseInt(time[1]), Integer.parseInt(time[2]));
		long t1=calendar.getTimeInMillis();
		date=date2.split("-");
		time=time2.split(":");
		calendar.clear();
		calendar.set(Integer.parseInt(date[0]), Integer.parseInt(date[1]), Integer.parseInt(date[2]), Integer.parseInt(time[0]),Integer.parseInt(time[1]), Integer.parseInt(time[2]));
		long t2=calendar.getTimeInMillis();
		long t=t2-t1;
		int days=(int) (t/(24*60*60*1000));
		int hours=(int)(t/(1000*60*60));
		int mins=(int)(t/(1000*60));
		int second=(int)(t/(1000));
		Info gepInfo=new Info();
		gepInfo.set(date1+"   "+time1, date2+"   "+time2, days, hours, mins, second);
		HttpSession session=request.getSession();
		session.setAttribute("gepInfo",gepInfo);
		response.sendRedirect("./homework6/result.jsp");
	}
}
