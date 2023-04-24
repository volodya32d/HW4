import Shapes.*;
import Vertices.Vertex;
import Vertices.Vertex2;

public class Main {
    public static <Shape> void main(String[] args) {
        System.out.println("Triangle:");
        Shape triangle = new Triangle(new Vertex(1, 9),
                new Vertex(5, 7),
                new Vertex2(3, 5));
        System.out.println(" " + triangle);
        System.out.println("Perimeter:\n " + ((Triangle) triangle).getPerimeter());
        System.out.println("Area:\n " + ((Triangle) triangle).getArea());

        System.out.println("\n");

        System.out.println("Rectangle:");
        Shape rectangle = new Rectangle(new Vertices2(4, 9), 3.6, 7.1);
        System.out.println(" " + rectangle);
        System.out.println("Perimeter:\n " + ((Rectangle) rectangle).getPerimeter());
        System.out.println("Area:\n " + ((Rectangle) rectangle).getArea());

        System.out.println("\n");

        System.out.println("Circle:");
        Shape circle = new Circle(new Vertices2(8, 2), 6);
        System.out.println(" " + circle);
        System.out.println("Perimeter:\n " + ((Circle) circle).getPerimeter());
        System.out.println("Area:\n " + ((Circle) circle).getArea());

        System.out.println("\n");

        System.out.println("Square Pyramid:");
        Shape sqrPyr = new SquarePyramid(new Vertex(8, 3, 4), 10.3, 3.5);
        System.out.println(" " + sqrPyr);
        System.out.println("Volume:\n " + ((SquarePyramid) sqrPyr).getVolume());
        System.out.println("Area:\n " + ((SquarePyramid) sqrPyr).getArea());

        System.out.println("\n");

        System.out.println("Cuboid:");
        Shape cub = new Cuboid(new Vertices3(2, -7, 1), 2, 8, 3);
        System.out.println(" " + cub);
        System.out.println("Volume:\n " + ((Cuboid) cub).getVolume());
        System.out.println("Area:\n " + ((Cuboid) cub).getArea());

        System.out.println("\n");

        System.out.println("Sphere:");
        Shape sphere = new Sphere(new Vertices3(8, 1, 3), 3.3);
        System.out.println(" " + sphere);
        System.out.println("Volume:\n " + ((Sphere) sphere).getVolume());
        System.out.println("Area:\n " + ((Sphere) sphere).getArea());

        Shape[] myShapes = new Shape[]{cub, sphere, circle, sqrPyr, triangle, rectangle};
        for (Shape shape : myShapes)
            System.out.println(shape.getClass().getName() + ": " + " \n" + shape);
    }
}
