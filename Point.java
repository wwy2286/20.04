public class Point implements Comparable<Point>{
    private int x;
    private int y;
    Point(){

    }

    Point(int x, int y){
        this.x=x;
        this.y=y;
    }

    public void setX(int x){
        this.x=x;
    }

    public void setY(int y){
        this.y=y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public int compareTo(Point point){
        if (this.x==point.getX()){
            if(this.y>point.getY()){
                return 1;
            }
            else if (this.y<point.getY()){
                return -1;
            }
            else{
                return 0;
            }
        }
        else if(this.x>point.getX()){
            return 1;
        }else{
            return -1;
        }
    }

    public String toString(){
        return x + ", " + y;
    }

}
