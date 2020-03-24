package lab2_question3;

public class TestShape {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];

        shapes[0] = new Rectangle("Rectangle", "red", 4,5);
        shapes[1] = new Triangle("Triangle", "blue", 4, 5);
        shapes[2] = new Circle("circle", "black", 9);
        shapes[3] = new Cylinder("Cylinder", "indigo", 5, 9);

        for (int i = 0; i < shapes.length; i++){
            System.out.println("................................");
            System.out.printf("Shape %d%n", i+1);
            System.out.print(shapes[i]);
            System.out.printf("Area: %.2f%n", shapes[i].calc_area());

            if (shapes[i] instanceof Cylinder){
                Cylinder cyl = (Cylinder) shapes[i];
                System.out.printf("Volume: %.2f", cyl.calc_volume());
            }
        }

    }
}
