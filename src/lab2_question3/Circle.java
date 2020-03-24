package lab2_question3;

public class Circle extends Shape {
    protected double radius;

    public Circle(String type, String colour, double radius){
        super(type, colour);
        this.radius = radius;
    }

    public String toString() {
        return super.toString() + "The radius of the " + this.type + " is " + this.radius + "\n";
    }

    @Override
    public double calc_area() {
        return Math.PI * this.radius * this.radius;
    }
}
