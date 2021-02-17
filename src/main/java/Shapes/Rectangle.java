package Shapes;

public class Rectangle implements Shape{

    private String shapeName;
    private double l,w;


    public Rectangle(double l, double w){
        this.l = l;
        this.w = w;
        this.shapeName = "Rectangle";
    }
    @Override
    public String shapeName() {
        return this.shapeName;
    }

    @Override
    public double calculateArea() {
        return this.l * this.w;
    }
}
