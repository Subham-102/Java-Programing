public class AreaCalculator {
    
    public double calculateArea(double length, double width) {
        return length * width;
    }

    
    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        
        AreaCalculator calculator = new AreaCalculator();

        
        double rectangleArea = calculator.calculateArea(5.0, 3.0);
        System.out.println("Area of rectangle: " + rectangleArea);

        
        double circleArea = calculator.calculateArea(2.5);
        System.out.println("Area of circle: " + circleArea);
    }
}