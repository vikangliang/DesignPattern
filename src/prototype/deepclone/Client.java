package prototype.deepclone;



public class Client {
    public static void main(String args[]) throws CloneNotSupportedException {
        Sheep sheep=new Sheep("tom",2,"write");
        Sheep sheep1= (Sheep) sheep.clone();

        System.out.println(sheep);
        System.out.println(sheep1);
    }
}
