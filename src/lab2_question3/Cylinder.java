package lab2_question3;

public class Cylinder extends Circle{
    protected double height;
    protected double volume;

    public Cylinder(String type, String colour, double radius, double height){
        super(type, colour, radius);
        this.height = height;
        this.volume = 0;
    }

    public String toString() {
        return super.toString() + "The height of the " + this.type + " is " + this.height + "\n";
    }

    @Override
    public double calc_area() {
        return (2 * Math.PI * this.radius * this.radius) + (2 * Math.PI * this.radius * this.height);
    }

    public double calc_volume(){
        return Math.PI * this.radius * this.radius * this.height;
    }
}
