package Shapes;

public class Square implements Shape{

    private String shapeName;
    private double side;

    public Square(double side){
        this.shapeName = "Square";
        this.side = side;
    }

    @Override
    public String shapeName() {
        return this.shapeName;
    }

    @Override
    public double calculateArea() {
        return this.side  * this.side;
    }
}
