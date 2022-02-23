package ss6_inheritance.excercise.point2dand3d;

public class Point3D extends Point2D{
    private float z=0;

    public Point3D(){};

    public Point3D(float z){
        this.z=z;
    }

    public Point3D(float x, float y, float z){
        super(x, y);
        this.z=z;
    }

    public void setZ(float z) {
        this.z=z;
    }

    public float getZ() {
        return z;
    }

    public void setXYZ(float x, float y, float z){
        this.z=z;
        super.setX(x);
        super.setY(y);
    }

    public float[] getXYZ(){
        float[] array = new float[3];
        array[0]=super.getX();
        array[1]=super.getY();
        array[2]=getZ();
        return array;
    }

    @Override
    public String toString() {
        return "Point3D{" + "x= "+ super.getX()+ " y= "+super.getY()+
                " z= " + z +
                '}';
    }
}
