public class Circle {
    int x;
    int y;
    int radius;
    int[] center = new int[]{x,y};
    Circle(int r){
        x=0;
        y=0;
        radius = r;
    }
    Circle(int absciss, int ordinat,int r){
        x=absciss;
        y=ordinat;
        radius = r;
    }
    public void calculatePerimeter(){
        double pi = 3.14;
        double perimeter = 2*radius*pi;
        System.out.println("perimeter is: " + perimeter);
    }
}
