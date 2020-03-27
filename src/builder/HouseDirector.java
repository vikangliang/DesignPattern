package builder;

public class HouseDirector {
    HouseBuilder houseBuilder=null;

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House build(){
        return houseBuilder.build();
    }
}
