import java.util.Comparator;

public class CompareY implements Comparator<Point> {

    public int compare(Point firstPoint,Point secondPoint){
        int x1 = firstPoint.getX();
        int x2 = secondPoint.getX();
        int y1 = firstPoint.getY();
        int y2 = secondPoint.getY();

        if (y1 == y2){
            if(x1<x2){
                return -1;
            }

            else if(x1>x2) {
                return 1;
            } else{
                return 0;
            }
        } else if(y1>y2){
            return 1;
        } else{
            return -1;
        }
    }

}
