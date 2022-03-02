package servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Register extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置响应类型以及编码格式，不设置的话显示全是问号
        response.setContentType("text/html;charset=utf-8");
        // 设置请求的编码格式，解决中文乱码问题
        request.setCharacterEncoding("UTF-8");
        //获取传递过来的用户名和密码
        String username = (String) request.getParameter("username");
        String password = (String) request.getParameter("password");
        //是否已经注册的标志
        boolean isRegister = false;
        //获取一个Date对象
        Date date = new Date();
        //创建一个格式化日期对象
        DateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //格式化当前时间
        String registerTime = simpleDateFormat.format(date);
        //没有输入用户名和密码直接访问时，重定向到登录页
        if (username == null || password == null) {
            response.sendRedirect("index.jsp");
        }
        /*检查该用户是否注册，已经注册的不可以重复注册*/
        //获取数据库连接
        try {
            //获取数据库连接
            Connection connection = DbConn.connectMySql();
            //定义SQL语句
            String sqlString = "select username from user";
            //实例化数据库操作对象
            PreparedStatement preparedStatement = DbConn.createPreparedStatement(connection, sqlString);
            //执行sql语句返回结果集
            ResultSet rSet = preparedStatement.executeQuery(sqlString);
            // 展开结果集
            while (rSet.next()) {
                String user = rSet.getString("username");
                if (user.equals(username)) {
                    isRegister = true;//查询到该用户
                    break;
                }
            }
            //关闭数据库连接
            DbConn.close(connection, preparedStatement, rSet);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //根据是否注册，执行后续操作
        if (isRegister == true) {
            PrintWriter out = response.getWriter();
            out.println("<script type='text/javascript'>alert('该用户已经注册，不可重复注册');window.history.go(-1);</script>");
        } else {//执行注册
            try {
                //获取数据库连接
                Connection connection = DbConn.connectMySql();
                //定义注册的SQL语句,SQL语句中字符串要有单引号
                String registerSQL = "insert into user (username,password,registerTime) values (" + "'" + username + "'" + ","
                        + "'" + password + "'" + "," + "'" + registerTime + "')";
                //out.print(registerSQL);
                //获取数据库操作对象
                PreparedStatement perStatement = DbConn.createPreparedStatement(connection, registerSQL);
                //执行插入语句，实现注册功能
                perStatement.executeUpdate();
                PrintWriter out = response.getWriter();
                out.println("<script type='text/javascript'>alert('注册成功');window.history.go(-1);</script>");
                // 完成后关闭连接
                DbConn.close(connection, perStatement);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 设置请求的编码格式，解决中文乱码问题
        request.setCharacterEncoding("UTF-8");
        //获取传递过来的用户名和密码
        String username = (String) request.getParameter("username");
        String password = (String) request.getParameter("password");
        //是否已经注册的标志
        boolean isRegister = false;
        //获取一个Date对象
        Date date = new Date();
        //创建一个格式化日期对象
        DateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //格式化当前时间
        String registerTime = simpleDateFormat.format(date);
        //没有输入用户名和密码直接访问时，重定向到登录页
        if (username == null || password == null) {
            response.sendRedirect("index.jsp");
        }
        /*检查该用户是否注册，已经注册的不可以重复注册*/
        //获取数据库连接
        try {
            //获取数据库连接
            Connection connection = DbConn.connectMySql();
            //定义SQL语句
            String sqlString = "select username from user";
            //实例化数据库操作对象
            PreparedStatement preparedStatement = DbConn.createPreparedStatement(connection,sqlString);
            //执行sql语句返回结果集
            ResultSet rSet = preparedStatement.executeQuery(sqlString);
            // 展开结果集
            while (rSet.next()) {
                String user = rSet.getString("username");
                if (user.equals(username)) {
                    isRegister = true;//查询到该用户
                    break;
                }
            }
            //关闭数据库连接
            DbConn.close(connection,preparedStatement,rSet);
        }catch (SQLException e) {
            e.printStackTrace();
        }
        //根据是否注册，执行后续操作
        if (isRegister == true) {
            PrintWriter out = response.getWriter();
            out.println("<script type='text/javascript'>alert('该用户已经注册，不可重复注册');window.history.go(-1);</script>");
        } else {//执行注册
            try {
                //获取数据库连接
                Connection connection = DbConn.connectMySql();
                //定义注册的SQL语句,SQL语句中字符串要有单引号
                String registerSQL = "insert into user (username,password,registerTime) values (" + "'" + username + "'" + ","
                        + "'" + password + "'" + "," + "'" + registerTime + "')";
                //out.print(registerSQL);
                //获取数据库操作对象
                PreparedStatement perStatement = DbConn.createPreparedStatement(connection,registerSQL);
                //执行插入语句，实现注册功能
                perStatement.executeUpdate();
                //设置相应类型以及编码格式，不设置的话显示全是问号
                response.setContentType("text/html;charset=utf-8");
                PrintWriter out = response.getWriter();
                out.println("<script type='text/javascript'>alert('注册成功');window.history.go(-1);</script>");
                // 完成后关闭连接
                DbConn.close(connection,perStatement);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
