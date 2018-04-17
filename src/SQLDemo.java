import java.sql.*;

public class SQLDemo {
    public static void main(String[] args) {
        Connection con = null;
        ResultSet rs1;

        //连接数据库
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception e) {
            e.printStackTrace();
        }

        String uri = "jdbc:mysql://localhost:3306/XSCJ";
        String user = "root";
        String password = "wyf19971006..";
        try {
            con = DriverManager.getConnection(uri, user, password);
            System.out.println("数据库连接成功");
        } catch (SQLException e) {
            e.printStackTrace();
        }


        /*
        //插入数据
        try {

            // 1、获取操作数据对象
            Statement st = con.createStatement();
            //2、创建SQL语句
            String sql = "INSERT INTO student (Sname,Sno) VALUES('张三','110')";
            //3、执行SQL语句返回结果
            int rs = st.executeUpdate(sql);
            //4、输出结果
            System.out.println("成功插入了一条数据" + rs);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        */

        /*
        //修改数据
        try {
            //1、获取操作对象
            Statement st = con.createStatement();
            //2、创建sql语句
            String sql = "UPDATE student SET Sname = '赵括有' WHERE Sno = '110'";
            //3、执行SQL语句返回结果
            int rs = st.executeUpdate(sql);
            //4、输出结果
            System.out.println("成功的修改了一条数据+rs");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        */


        /*
        //删除数据

        try {
            //1、创建操作对象
            Statement st = con.createStatement();
            //2、SQL语句
            String sql = "delete from student where Sno = '110'";
            //3、执行sql返回结果
            int rs = st.executeUpdate(sql);
            //4、输出结果
            System.out.println(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        */


        //查询数据
        try {
            //1、创建操作对象
            Statement st = con.createStatement();
            //2、Sql语句
            String sql = "select * from student";
            //3、执行SQL语句返回结果
            ResultSet rs = st.executeQuery(sql);
            //4、遍历结果
            while (rs.next()) {
                String name = rs.getString("Sname");
                String no = rs.getString("Sno");

                System.out.println(name + "," + no);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}