package composite;

public class Client {
    public static void main(String args[]) {
        OrganizationComponent university = new University("大学", "大学");
        OrganizationComponent college1=new College("计算机工程学院","计算机工程学院");
        OrganizationComponent college2=new College("外国语工程学院","外国语工程学院");

        college1.add(new Department("软件工程","软件工程"));
        college1.add(new Department("计算机科学与技术","计算机科学与技术"));
        college1.add(new Department("大数据技术","大数据技术"));

        college2.add(new Department("商务英语","商务英语"));
        college2.add(new Department("日语","日语"));

        university.add(college1);
        university.add(college2);

        college1.print();
        System.out.println("================");
        university.print();
    }
}
