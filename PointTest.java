import org.junit.Assert;

public class PointTest {
    @org.junit.Test
    public void compareTo() throws Exception {



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


        Assert.assertEquals("point 1 greater than point 3 in terms of x",1, point1.compareTo(point3));
        Assert.assertEquals("point 1 greater than point 2 in terms of x, then y",1, point1.compareTo(point2));
        Assert.assertEquals("point 1 greater than point 5 in terms of x, then y",0, point1.compareTo(point5));
        Assert.assertEquals("point 1 greater than point 4 in terms of x, then y",-1, point1.compareTo(point4));
    }

}