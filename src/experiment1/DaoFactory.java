package experiment1;

public abstract class DaoFactory {
    private static final int sqlFlag = 1;
    private static final int oracleFlag = 2;

    public static DaoFactory getDaoFactory(int flag){
        switch(flag){
            case sqlFlag:
                return new SqlDaoFactory();
            case oracleFlag:
                return new OracleDaoFactory();
            default:
                return null;
        }
    }

    public abstract IStuOperDao getStuOperDao();
}
