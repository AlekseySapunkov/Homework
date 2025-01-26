public class Triangle {
    int a;
    int  b;
    int c;
    Triangle(int first,int second, int thirsd){
        a=first;
        b= second;
        c= thirsd;

    }
    public void showSidesOfTriangle(){
        System.out.println("Sides of triangle:");
        System.out.println("a= "+a);
        System.out.println("b= "+b);
        System.out.println("c= "+c);
    }
}
