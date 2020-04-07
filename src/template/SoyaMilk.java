package template;

public abstract class SoyaMilk {
    final void make() {
        select();
        add();
    }

    void select() {
        System.out.println("选择材料");
    }

    abstract void add();
}
