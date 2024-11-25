package miscellaneous.reference_type;

import javax.lang.model.element.Name;

public class ObjectName {
    private String name;
    public ObjectName(String name) {
        this.name=name;
    }

    @Override
    public String toString() {
        return "ObjectName{" +
                "name='" + name + '\'' +
                '}';
    }
}
