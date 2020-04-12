package visitor;

public class Fail extends Action {
    @Override
    public void getManResult(Man man) {
        System.out.println("男的给评价为失败");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("女的给评价为失败");
    }
}
