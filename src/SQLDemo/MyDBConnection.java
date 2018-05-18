package SQLDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MyDBConnection {

    private String DBDriver;
    private String DBURL;
    private String DBUser;
    private String DBPass;

    private Connection con = null;
    private Statement st = null;

    public MyDBConnection() {
            DBDriver = "com.mysql.jdbc.Driver";
            DBURL = "jdbc:mysql://localhost:3306/XSCJ";
            DBUser = "root";
            DBPass = "wyf19971006..";

            try {
                Class.forName(DBDriver);
            } catch (Exception e) {
                e.printStackTrace();
            }

            try {
                con = DriverManager.getConnection(DBURL, DBUser, DBPass);
                st = con.createStatement();
                System.out.println("数据库连接成功");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public Connection getMyConnection () {
            return con;
        }

        public Statement getMyStatement () {
            return st;
        }

        public void close () {
            try {
                st.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public String toString () {
            return "数据库驱动程序" + DBDriver + "用户名" + DBUser;
        }

    public static void main(String[] args) {
        MyDBConnection my = new MyDBConnection();
    }
}
