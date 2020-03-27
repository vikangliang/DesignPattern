package builder;

public abstract class HouseBuilder {

    private House house = new House();

    public abstract void buildBasic();

    public abstract void buildWall();

    public abstract void buildRoofed();

    public House build() {
        buildBasic();
        buildWall();
        buildRoofed();
        return house;
    }
}
