package builder;

public class CommonHouse extends HouseBuilder{
    @Override
    public void buildBasic() {
        System.out.println("地基");
    }

    @Override
    public void buildWall() {
        System.out.println("墙");
    }

    @Override
    public void buildRoofed() {
        System.out.println("屋顶");
    }
}
