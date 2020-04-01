package composite;

import java.util.ArrayList;
import java.util.List;

public class College extends OrganizationComponent {
    List<OrganizationComponent> organizationComponentLists = new ArrayList<>();

    public College(String name, String des) {
        super(name, des);
    }

    @Override
    protected void print() {
        System.out.println(getName());
        for(OrganizationComponent component:organizationComponentLists){
            component.print();
        }
    }

    @Override
    public void add(OrganizationComponent organizationComponent) {
        organizationComponentLists.add(organizationComponent);
    }

    @Override
    public void remove(OrganizationComponent organizationComponent) {
        organizationComponentLists.remove(organizationComponent);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    @Override
    public String toString() {
        return "College{" +
                "organizationComponentLists=" + organizationComponentLists +
                '}';
    }
}
