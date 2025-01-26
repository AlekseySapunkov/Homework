import java.util.Arrays;

public class Point {
     double x;
     double y;
    Point(){
        x=0;
        y=0;
    }
    Point(double abscissa, double ordinate){
        x= abscissa;
        y= ordinate;

    }
    public  void showCoordinates(){
        double[] coordinates = new double[]{x,y};
        System.out.println(Arrays.toString(coordinates));
    }
    public  void findDistanceFromTheOrigin(){
        double distance = Math.sqrt(Math.pow((x-0),2.0)+Math.pow((y-0),2));
        System.out.println(distance);
    }
    public  void moveToVector(double a, double b){
         double[] newCoordinate = new double[]{x+a, y+b};
         System.out.println(Arrays.toString(newCoordinate));
    }
}
