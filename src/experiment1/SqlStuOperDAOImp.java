package experiment1;

import java.sql.Connection;
import java.sql.Statement;

public class SqlStuOperDAOImp implements  IStuOperDao {
    private Connection conn;

    public SqlStuOperDAOImp(Connection conn) {
        this.conn = conn;
    }

    @Override
    public int addStu(Student stu) {
        Statement stmt = null;
        String sql = "insert into student values('"
                + stu.getStuName() + "','"
                + stu.getStuPwd() + "')";
        int num = 0;

        try{
            stmt = conn.createStatement();
            num = stmt.executeUpdate(sql);

        }catch (Exception e){
            e.printStackTrace();
        }

        try{
            if(stmt != null){
                stmt.close();
            }
            if(conn != null){
                conn.close();
            }
        }catch(Exception e){

        }

        return num;
    }

    @Override
    public int delStu(int stuID) {
        return 0;
    }

    @Override
    public Student getStu(int stuID) {
        return null;
    }

    @Override
    public int updateStu(int stuID) {
        return 0;
    }
}
