package proxy.staticproxy;

public class TeacherDaoProxy implements ITeacherDao {

    private ITeacherDao iTeacherDao;

    public TeacherDaoProxy(ITeacherDao iTeacherDao) {
        this.iTeacherDao = iTeacherDao;
    }

    @Override
    public void teach() {
        System.out.println("开始代理");
        iTeacherDao.teach();
        System.out.println("提交");
    }
}
