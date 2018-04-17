import java.sql.*;

public class SQLDemo {

    //mysql驱动包名
    private static final String DRIVER_NAME = "com.mysql.jdbc.Driver";
    //数据库连接地址
    private static final String URL = "jdbc:mysql://localhost:3306/teacher";
    //用户名
    private static final String USER_NAME = "root";
    //密码
    private static final String PASSWORD = "wyf19971006..";
    public Connection conn = null;
    public PreparedStatement pst = null;

    public SQLDemo(String sql){
        try {
            Class.forName(DRIVER_NAME);
            conn = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
            pst = conn.prepareStatement(sql);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void close(){
        try {
            this.conn.close();
            this.pst.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String sql = "SELECT * FROM user";
        SQLDemo db1 = new SQLDemo(sql);
        try {
            ResultSet ret = db1.pst.executeQuery();
            while (ret.next()){
                String uid = ret.getString(1);
                String uname = ret.getString(2);
                System.out.print(uid+"\t"+uname);
            }
            ret.close();
            db1.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
