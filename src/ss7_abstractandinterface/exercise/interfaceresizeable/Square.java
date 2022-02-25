package ss7_abstractandinterface.exercise.interfaceresizeable;

public class Square extends ReTangle implements Resizeable{
    public Square(){};

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }

    public double getSide(){
        return getWidth();
    }

    public void setSide(double side){
        setWidth(side);
        setLength(side);
    }

    @Override
    public void resize(double percent) {
        setSide(super.getWidth()+ super.getWidth()*percent);
        System.out.println("Area after increase the side "+ percent*100+ "% is: " +getArea());
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()+ " has area " + super.getArea();
    }
}
