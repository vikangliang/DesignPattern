package prototype.deepclone;



public class Client {
    public static void main(String args[]) throws CloneNotSupportedException {
        Sheep sheep=new Sheep("tom",2,"write");
        sheep.setType(new Type("白羊"));

//方式一
//        Sheep sheep1= (Sheep) sheep.clone();
//        System.out.println(sheep+"type="+sheep.getType().hashCode());
//        System.out.println(sheep1+"type="+sheep1.getType().hashCode());

//方式二
        Sheep sheep1= (Sheep) sheep.deepClone();
        System.out.println(sheep+"type="+sheep.getType().hashCode());
        System.out.println(sheep1+"type="+sheep1.getType().hashCode());
    }
}
