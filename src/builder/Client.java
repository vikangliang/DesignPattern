package builder;

public class Client {
    public static void main(String args[]){
        CommonHouse commonHouse=new CommonHouse();
        HouseDirector houseDirector=new HouseDirector(commonHouse);
        House house=houseDirector.build();
    }
}
