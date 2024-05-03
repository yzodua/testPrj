package org.op;

/**
 * @author YZaychyk
 * @since 1.0
 **/
public class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (!this.getClass().equals(obj.getClass())) {
            return false;
        }
        Shape other = (Shape) obj;
        return name.equalsIgnoreCase(other.name);
    }
}
