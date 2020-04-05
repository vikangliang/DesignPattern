package flyweight;

public class Client {
    public static void main(String args[]){
        WebsiteFactory websiteFactory=new WebsiteFactory();
        Website website1=websiteFactory.getWeb("新闻");
        Website website2=websiteFactory.getWeb("博客");
        Website website3=websiteFactory.getWeb("博客");

        User user=new User();
        user.setName("张三");
        User user1=new User();
        user1.setName("李四");

        website1.use(user);
        website2.use(user);
        website3.use(user1);

        System.out.println(websiteFactory.getpoolCount());
    }
}
