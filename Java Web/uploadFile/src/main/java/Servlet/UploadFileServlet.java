package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class UploadFileServlet
 */
@WebServlet("/upload")
public class UploadFileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UploadFileServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("文件上传");
        //设置请求编码
        request.setCharacterEncoding("UTF-8");
        //获取普通表单项
        String uname = request.getParameter("uname");
        System.out.println("uname:"+ uname);
        //获取part对象（Servlet将multipart/form-data的post请求封装成Part对象）
        Part part = request.getPart("myfile");//表单中file文件域的name属性
        //通过part对象得到上传的文件名
        String fileName = part.getSubmittedFileName();
        System.out.println("上传的文件名："+fileName);
        //得到文件上传路径
        String filePath = request.getServletContext().getRealPath("/");
        System.out.println("文件上传路径为："+filePath);
        //上传文件到指定目录
        part.write(filePath + "/uploads/" + fileName);
	}

}
