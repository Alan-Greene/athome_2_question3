package lab2_question3;

public class Triangle extends Shape {
    protected double base;
    protected double height;

    public Triangle(String type, String colour, double base, double height){
        super(type, colour);
        this.base = base;
        this.height = height;
    }

    public String toString() {
        return super.toString() + "The base of the " + this.type + " is " + this.base + "\nThe height of the " + this.type + " is " + this.height + "\n";
    }

    @Override
    public double calc_area() {
        return 0.5 * (this.base * this.height);
    }
}
