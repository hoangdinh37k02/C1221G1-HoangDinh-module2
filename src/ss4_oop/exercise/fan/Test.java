package ss4_oop.exercise.fan;

public class Test {
    public static void main(String[] args) {
        Fan fan1=new Fan();
        Fan fan2=new Fan();

        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10);
        fan1.setOn(true);
        fan1.setColor("yellow");

        fan2.setOn(false);
        fan2.setColor("blue");
        fan2.setRadius(5);
        fan2.setSpeed(fan2.MEDIUM);

        fan1.show();
        fan2.show();
    }
}
