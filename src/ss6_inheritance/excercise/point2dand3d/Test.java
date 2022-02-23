package ss6_inheritance.excercise.point2dand3d;

public class Test {
    public static void main(String[] args) {
        Point2D point = new Point2D();
        System.out.println(point);

        point = new Point2D(2,3);
        System.out.println(point);

        Point3D point3D = new Point3D();
        System.out.println(point3D);

        point3D= new Point3D(1);
        System.out.println(point3D);

        point3D = new Point3D(1,2,3);
        System.out.println(point3D);
    }
}
