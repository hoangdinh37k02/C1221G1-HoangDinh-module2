package ss6_inheritance.excercise.pointandmoveablepoint;

public class Test {
    public static void main(String[] args) {
        Point point=new Point();
        System.out.println(point);

        point = new Point(1,2);
        System.out.println(point);

        MovablePoint movablePoint=new MovablePoint();
        System.out.println();

        movablePoint=new MovablePoint(3,4);
        System.out.println(movablePoint);

        movablePoint=new MovablePoint(5,6,3,4);
        System.out.println(movablePoint);
    }
}
