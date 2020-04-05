package flyweight;

public class CWebsite extends Website {
    private String type="";

    public CWebsite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("发布形式"+type+"用户为"+user.getName());
    }
}
