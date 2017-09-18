import java.util.Arrays;

public class Main {
    public static void main(String []args){
        Point[] points = new Point[100];
        for (int i = 0; i<points.length; i++){
            points[i] = new Point((int)(Math.random()*10),(int)(Math.random()*10));
            System.out.println(points[i]);
        }

        Arrays.sort(points);
        System.out.println("Points sorted by x, then y");
        for (int i = 0; i<points.length; i++){

            System.out.println(points[i]);
        }

        Arrays.sort(points, new CompareY());
        System.out.println("Points sorted by y, then x");
        for (int i = 0; i<points.length; i++){

            System.out.println(points[i]);
        }
    }
}
