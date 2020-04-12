package visitor;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ObjectStructs {
    private List<Person> list = new LinkedList<>();

    public void attach(Person p) {
        list.add(p);
    }

    public void remove(Person p) {
        list.remove(p);
    }

    public void display(Action action) {
        for (Person p : list) {
            p.accept(action);
        }
    }
}
