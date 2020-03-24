package lab2_question3;

public abstract class Shape {
    protected String type;
    protected String colour;
    protected double area;

    public Shape(String type, String colour){
        this.type = type;
        this.colour = colour;
        this.area = 0;
    }

    public String toString() {
        return "The type of shape is: " + this.type + "\nThe colour of the " + this.type + " is: " + this.colour + "\n";
    }

    public abstract double calc_area();
}
