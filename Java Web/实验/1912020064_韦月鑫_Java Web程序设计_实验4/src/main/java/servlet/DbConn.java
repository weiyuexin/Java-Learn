package servlet;

import java.sql.*;

public class DbConn {
    //数据库连接对象
    private static Connection connection = null;
    //数据库操作对象
    private static PreparedStatement ps = null;
    //数据库驱动
    private static String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    //数据库连接地址
    private static String DB_URL = "jdbc:mysql://localhost:3306/javaweb?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
    // 数据库用户名和密码
    private static String USER = "root";
    private static String PASS = "root";

    /*获取数据库连接对象*/
    public static Connection connectMySql() {
        try {
            // 加载驱动程序
            Class.forName(JDBC_DRIVER);
            // 连接数据库
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            if (!connection.isClosed()) {//数据库连接成功
                System.out.println("数据库连接成功");
            } else {
                System.out.println("数据库连接失败");
            }
        } catch (SQLException se) {
            // 处理 JDBC 错误
            se.printStackTrace();
        } catch (Exception e) {
            // 处理 Class.forName 错误
            e.printStackTrace();
        }
        return connection;
    }

    /*获取数据库操作对象*/
    public static PreparedStatement createPreparedStatement(Connection connection, String sql) {

        try {
            ps = connection.prepareStatement(sql);
        }catch (SQLException e){
            e.printStackTrace();
        }
        return ps;
    }
    /*释放资源*/
    public static void close(Connection connection,PreparedStatement preparedStatement){
        //释放数据库操作对象
        if(preparedStatement!=null){
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        //释放数据库操作对象
        if(connection!=null){
            try {
                connection.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
    /*方法重载，用来释放查询结果集*/
    public static void close(Connection connection,PreparedStatement preparedStatement,ResultSet resultSet){
        //调用释放资源的方法
        close(connection,preparedStatement);
        //释放查询结果集
        if(resultSet!=null){
            try {
                resultSet.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
    }

}
