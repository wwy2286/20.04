import org.junit.Assert;
import org.junit.Test;

public class CompareYTest {
    @Test
    public void compare() throws Exception {
        CompareY comparePoint = new CompareY();
        Point point1 = new Point(5,4);
        Point point2 = new Point (5,3);
        Point point3 = new Point(3,3);
        Point point4 = new Point(6,7);
        Point point5 = new Point(5,4);

        System.out.println("point 1 = " + point1);
        System.out.println("point 2 = " + point2);
        System.out.println("point 3 = " + point3);
        System.out.println("point 4 = " + point4);
        System.out.println("point 5 = " + point5);


        Assert.assertEquals("point 2 greater than point 3 in terms of y, then x",1, comparePoint.compare(point2, point3));
        Assert.assertEquals("point 1 greater than point 5 in terms of y, then x",0,comparePoint.compare(point1, point5));
        Assert.assertEquals("point 3 greater than point 4 in terms of y, then x",-1,comparePoint.compare(point3, point4));
        Assert.assertEquals("point 4 greater than point 5 in terms of y, then x",1, comparePoint.compare(point4, point5));
    }

}