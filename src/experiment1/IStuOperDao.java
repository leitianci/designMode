package experiment1;

public interface IStuOperDao {
    public int addStu(Student stu);
    public int delStu(int stuID);
    public Student getStu(int stuID);
    public int updateStu(int stuID);
}
