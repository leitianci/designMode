package experiment1;

public class Client {
    public static void main(String[] args) {
        DaoFactory factory =
                DaoFactory.getDaoFactory(1);
        IStuOperDao iod = factory.getStuOperDao();
        Student stu = new Student();
        stu.setStuName("MC");
        stu.setStuPwd("123520");

        int num = iod.addStu(stu);
        if(num > 0){
            System.out.println("添加成功");
        }else{
            System.out.println("添加失败");
        }
    }
}
