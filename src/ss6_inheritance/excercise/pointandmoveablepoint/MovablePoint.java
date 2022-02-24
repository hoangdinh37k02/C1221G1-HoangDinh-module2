package ss6_inheritance.excercise.pointandmoveablepoint;

public class MovablePoint extends Point {
    private float xSpeed = 1.0f;
    private float ySpeed=2.0f;

    public MovablePoint(){}

    public MovablePoint(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed=ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed){
        super(x, y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public float[] getSpeed(){
        float[] array1=new float[2];
        array1[0]=xSpeed;
        array1[1]=ySpeed;
        return array1;
    }

    public MovablePoint move(){
        super.setX(this.getX() + xSpeed);
        super.setY(this.getY()+ySpeed);
        return this;
    }

    @Override
    public String toString() {
        return "Point {" +
                "x=" + super.getX() +
                ", y=" + super.getY() +
                '}'+
                "MovablePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

}
