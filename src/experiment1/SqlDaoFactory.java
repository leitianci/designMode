package experiment1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlDaoFactory extends DaoFactory{
    private  static String url =
            "jdbc:sqlserver://127.0.0.1:1433;databasename=j1106";
    private static String driveName =
            "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static String userName = "sa";
    private static String userPwd = "123";

    @Override
    public IStuOperDao getStuOperDao() {
        Connection conn = null;
        try{
            Class.forName(driveName);
            if(conn == null){
                conn =
                        DriverManager.getConnection(url,userName,userPwd);
            }
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return new SqlStuOperDAOImp(conn);
    }
}
