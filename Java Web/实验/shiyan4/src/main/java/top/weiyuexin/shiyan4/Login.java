package top.weiyuexin.shiyan4;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.sql.*;

public class Login extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 设置响应内容类型,设置编码，否则显示的全是问号
        response.setContentType("text/html;charset=utf-8");
        //连接数据库
        Connection connection = DbConn.connectMySql();
        // 设置请求的编码格式，解决中文乱码问题
        request.setCharacterEncoding("UTF-8");
        //获取传递过来的用户名和密码
        String username = (String) request.getParameter("username");
        String password = (String) request.getParameter("password");
        //没有输入用户名和密码直接访问时，重定向到登录页
        if (username == null || password == null) {
            response.sendRedirect("index.jsp");
        }
        /*验证登录*/
        try {
            //定义SQL语句
            String sqlString = "select * from user where username=" + "'" + username + "'" + "and password=" + "'" + password + "'";
            //实例化Statement对象
            PreparedStatement preparedStatement = DbConn.createPreparedStatement(connection,sqlString);
            //执行sql语句返回结果集
            ResultSet rSet = preparedStatement.executeQuery(sqlString);
            // 展开结果集
            if (rSet.next()) {
                //新建cookie对象
                Cookie c = new Cookie("username", username);
                // 设置最大保存时间
                c.setMaxAge(60 * 60 * 24);
                //通过response对象将cookie设置到客户端
                response.addCookie(c);
                response.sendRedirect("loginSuccess.jsp");
            } else {
                PrintWriter out = response.getWriter();
                out.println("<script type='text/javascript'>alert('该用户不存在或密码错误！');window.history.go(-1);</script>");
            }
            // 完成后关闭连接
            DbConn.close(connection,preparedStatement,rSet);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 设置响应内容类型
        response.setContentType("text/html;charset=utf-8");
        //连接数据库
        Connection connection = DbConn.connectMySql();
        // 设置请求的编码格式，解决中文乱码问题
        request.setCharacterEncoding("UTF-8");
        //获取传递过来的用户名和密码
        String username = (String) request.getParameter("username");
        String password = (String) request.getParameter("password");
        //没有输入用户名和密码直接访问时，重定向到登录页
        if (username == null || password == null) {
            response.sendRedirect("index.jsp");
        }
        /*验证登录*/
        try {
            //定义SQL语句
            String sqlString = "select * from user where username=" + "'" + username + "'" + "and password=" + "'" + password + "'";
            //实例化Statement对象
            PreparedStatement preparedStatement = DbConn.createPreparedStatement(connection,sqlString);
            //执行sql语句返回结果集
            ResultSet rSet = preparedStatement.executeQuery(sqlString);
            // 展开结果集
            if (rSet.next()) {
                //新建cookie对象
                Cookie c = new Cookie("username", username);
                // 设置最大保存时间
                c.setMaxAge(60 * 60 * 24);
                //通过response对象将cookie设置到客户端
                response.addCookie(c);
                response.sendRedirect("loginSuccess.jsp");
            } else {
                PrintWriter out = response.getWriter();
                response.getWriter().println("<script type='text/javascript'>alert('该用户不存在或密码错误!');window.history.go(-1);</script>");
            }
            // 完成后关闭连接
            DbConn.close(connection,preparedStatement,rSet);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
