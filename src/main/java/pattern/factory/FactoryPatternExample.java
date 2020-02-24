package pattern.factory;

public class FactoryPatternExample {
    public static void main(String[] args) {

        FactoryPatternExample example = new FactoryPatternExample();
        example.printShape("CIRCLE");

    }

    public void printShape(String shapeType) {

        Shape shape2 = ShapeFactory.getShape(shapeType);
        shape2.draw();

    }
}
