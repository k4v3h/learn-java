package designpatterns.composite;

public class Composite {
    public static void main(String[] args) {
        Circle circle1 = new Circle("Circle 1");
        Circle circle2 = new Circle("Circle 2");
        Triangle triangle1 = new Triangle("Triangle 1");
        Triangle triangle2 = new Triangle("Triangle 1");

        CompositeGraphic composite1 = new CompositeGraphic("Composite 1");
        composite1.add(circle1);

        CompositeGraphic composite2 = new CompositeGraphic("Composite 2");
        composite2.add(circle2);
        composite2.add(triangle1);

        CompositeGraphic composite3 = new CompositeGraphic("Composite 3");
        composite3.add(triangle2);

        composite1.add(composite2);
        composite2.add(composite3);

        composite1.print();
    }
}
