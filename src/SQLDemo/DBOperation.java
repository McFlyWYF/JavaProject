package SQLDemo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBOperation {

    private MyDBConnection myDB = null;
    private Connection con = null;
    private Statement st = null;
    private int scores;
    private int number1 = 0;
    private int number2 = 0;

    private String name;
    private String password;

    public DBOperation(MyDBConnection myDB) {
        con = myDB.getMyConnection();
        st = myDB.getMyStatement();
    }

    public void insert(String name, String password, int scores) {
        try {
            String newtype1 = new String(name.getBytes(), "GBK");
            String newtype2 = new String(password.getBytes(), "GBK");
            String sql = "INSERT INTO student(scores,name,password) VALUES(" + scores + " " + newtype1 + " " + newtype2 + ")";
            st.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete(int scores) {

        String sql = "DELETE FROM student WHERE scores =" + scores + "";
        System.out.println(sql);
        try {
            st.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(int mscores, int scores, String name, String password) {
        String sql = "UPDATE student SET scores=" + scores + ",name=" + name + ",password=" + password + "where scores=" + mscores + "&&name=" + name + "&&password" + password + " ";
        try {
            st.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean selectPassword(String mpassword) {//查询密码
        String sql = "SELECT scores,name,password FROM student";
        try {
            ResultSet rs = st.executeQuery(sql);//返回结果集
            while (rs.next()) {//指针向后移动
                password = rs.getString("password");
                number2++;
                if (password.equals(mpassword) && (number2 == number1)) {
                    return true;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean selectName(String mname) {//查询id
        String sql = "SELECT scores,name,password FROM player";
        try {
            ResultSet rs = st.executeQuery(sql);//返回结果集
            while (rs.next()) {//指针向后移动
                name = rs.getString("name");
                number1++;
                if (name.equals(mname)) {
                    return true;
                }
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public int getScores() {
        return scores;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setNumber1() {
        number1 = 0;
    }

    public void setNumber2() {
        number2 = 0;
    }
}
