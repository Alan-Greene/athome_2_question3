package lab2_question3;

public class Rectangle extends Shape {
    protected double length;
    protected double width;

    public Rectangle(String type, String colour, double length, double width){
        super(type, colour);
        this.length = length;
        this.width = width;
    }

    public String toString() {
        return super.toString() + "The length of the " + this.type + " is " + this.length + "\nThe width of the " + this.type + " is " + this.width + "\n";
    }

    @Override
    public double calc_area() {
        return this.length * this.width;
    }
}
