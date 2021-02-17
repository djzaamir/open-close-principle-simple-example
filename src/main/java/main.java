import Shapes.*;

public class main {
    public static void main(String[] args) {

        int shapesCount = 3;

        Circle circle = new Circle(10);
        Square square = new Square(10);
        Rectangle rectangle = new Rectangle(5, 10);

        Shape shapes[] = new Shape[]{circle, square, rectangle};

        AreaCalculator.CalculateMultipleAreas(shapes);
    }
}
