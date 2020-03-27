package prototype.deepclone;

import java.io.Serializable;

public class Type implements Serializable,Cloneable {
    private String type;

    public Type(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Type{" +
                "type='" + type + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
