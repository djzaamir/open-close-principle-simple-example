package Shapes;

public class AreaCalculator {

    public static void CalculateMultipleAreas(Shape shapes[]){
        for (Shape s:
             shapes) {
            double area = s.calculateArea();
            System.out.printf("%s has an area of \"%f\"\n", s.shapeName(), area);
        }
    }
}
