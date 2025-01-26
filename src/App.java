public class App {
    static Point point = new Point(1,2);
    static Triangle triangle = new Triangle(1, 2, 3);
    static Circle circle = new Circle(1,2,3);
    static Date date = new Date(2025, 12, 4);
        public static void main(String[] args) throws Exception {
            point.showCoordinates();
            point.findDistanceFromTheOrigin();
            point.moveToVector(1,2);
            triangle.showSidesOfTriangle();
            circle.calculatePerimeter();
            date.findDayBefore();
    }
}
