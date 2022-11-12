package designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeGraphic extends Graphic {
    private final List<Graphic> childGraphics = new ArrayList<>();

    public CompositeGraphic(String name) {
        this.name = name;
    }

    public void add(Graphic graphic) {
        childGraphics.add(graphic);
    }

    public void print() {
        System.out.println(getName());
        for(Graphic graphic: childGraphics) {
            graphic.print();
        }
    }
}
