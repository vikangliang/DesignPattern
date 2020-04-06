package proxy.dynamic;



public class Client {
    public static void main(String args[]) {
        ITeacherDao teacherDao =  new  TeacherDao();
        ITeacherDao iTeacherDao = (ITeacherDao) new ProxyFactory(teacherDao).getProxyInstance();
        iTeacherDao.teach();
    }
}
