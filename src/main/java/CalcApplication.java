public class CalcApplication {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();                                 // [1]
        double area = calculator.circleArea(5);
        System.out.println("Area of the Circle with radius 5 equals: " + area);

        double p = Calculator.PI;
        System.out.println("The value of a pi constant is equal to " + p);        // [2]
    }
}