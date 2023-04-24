package Shapes;

import Vertices.Vertex;

import java.util.Arrays;
import java.util.Collections;

public class Circle extends PlaneShape {
    double radius;

    public Circle(Vertex center, double radius) {
        super (Collections.singletonList(center));
        this.radius = radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getVolume() {
        return 0;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", center=" + super.toString() +
                super.getAreaAndPerimeter() + "";
    }
}
