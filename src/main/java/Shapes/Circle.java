package Shapes;

public class Circle implements Shape{

    private String shapeName;
    private double r;

    public Circle(double r){
        this.r = r;
        this.shapeName = "Circle";
    }

    @Override
    public String shapeName() {
        return this.shapeName;
    }

    @Override
    public double calculateArea() {
        return Math.PI * (this.r * this.r);
    }
}
