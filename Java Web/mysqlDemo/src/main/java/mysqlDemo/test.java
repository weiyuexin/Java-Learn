package mysqlDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.cj.xdevapi.Statement;

public class test {
	 public static final String URL = "jdbc:mysql://localhost:3306/javaweb";
	    public static final String USER = "root";
	    public static final String PASSWORD = "root";

	    public static void main(String[] args) throws Exception {
	        //1.加载驱动程序
	        Class.forName("com.mysql.jdbc.Driver");
	        //2. 获得数据库连接
	        Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
	        Statement stmt = conn.createStatement();
	        ResultSet rs = stmt.executeQuery("SELECT user_name, age FROM imooc_goddess");
	        //如果有数据，rs.next()返回true
	        while(rs.next()){
	            System.out.println(rs.getString("user_name")+" 年龄："+rs.getInt("age"));
	        }
	    }
}
