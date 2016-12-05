package work5;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.core.ApplicationPart;


/**
 * Servlet implementation class StatisticFile
 */
@WebServlet("/StatisticFile")
@MultipartConfig()
public class StatisticFile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StatisticFile() {
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
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		String pathString=this.getServletContext().getRealPath("/");
		javax.servlet.http.Part p=request.getPart("myFile");
		if(p.getContentType().contains("text")){
			ApplicationPart ap=(ApplicationPart) p;
			@SuppressWarnings("deprecation")
			String fileName=ap.getFilename();
			int path_idx=fileName.lastIndexOf("\\")+1;
			String fileName1=fileName.substring(path_idx, fileName.length());
			p.write(pathString+"/upload/"+fileName1);
			long size=ap.getSize();
			BufferedReader bReader=new BufferedReader(new FileReader(new File(pathString+"/upload/"+fileName1)));
			String line=null;
			String reg="[\u4E00-\u9FA5]";
			int rows=0;
			int hanzi = 0,shuzi = 0,zimu=0;
			while((line=bReader.readLine())!=null){
				rows++;
				char []rowItem=line.toCharArray();
				for(int i=0;i<rowItem.length;i++){
					if(rowItem[i]>=0x0391 && rowItem[i]<=0xFFE5)
					{
						hanzi+=1;
						continue;
					}
					if(rowItem[i]>='0' && rowItem[i]<='9')
					{
						shuzi+=1;
						continue;
					}
					if((rowItem[i]>='A' && rowItem[i]<='Z') || (rowItem[i]>='a' && rowItem[i]<='z') )
					{
						zimu+=1;
						continue;
					}
				}
			}
		FileMessage fileMessage=new FileMessage();
	    fileMessage.set(fileName1,String.valueOf(size), String.valueOf(rows), String.valueOf(hanzi), String.valueOf(shuzi), String.valueOf(zimu));
	    HttpSession session=request.getSession();
	    session.setAttribute("fileMessage",fileMessage);
	    response.sendRedirect("./homework5/result.jsp");
		}else{
			out.write("<h1>请选择文本文件(txt文件)</h1>");
		}
	}

}
