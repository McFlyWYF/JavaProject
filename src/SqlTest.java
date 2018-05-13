import jdk.nashorn.internal.ir.Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


public class SqlTest {

    public static void main(String[] args) {

        Connection con = null;
        ResultSet rs;
        java.sql.Statement sql = null;

        //加载驱动
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch (Exception e){
            e.printStackTrace();
        }

        //连接
        String uri = "jdbc:mysql://localhost:3306/xscj?useSSL = true & characterEncoding = utf-8";
        String user = "root";
        String pw = "wyf19971006..";

        try{
            con = DriverManager.getConnection(uri,user,pw);
        }catch (SQLException e){
            e.printStackTrace();
        }

        //查询操作
        try{
            sql = con.createStatement();
            rs = sql.executeQuery("SELECT * FROM student");
            while (rs.next()){
                String a = rs.getString(1);
                String b = rs.getString(2);

                System.out.println(a + " " + b);
            }
            con.close();
        }catch (SQLException e){
            e.printStackTrace();
        }


    }
}
