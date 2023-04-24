package Shapes;

import Vertices.Vertex;

import java.util.Arrays;

public class Cuboid extends Shape {

    private double width;
    private double height;
    private double depth;


    public Cuboid(Vertex point, double width, double height, double depth) {
        super();
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public double getArea() {
        return 2 * (depth * width + width * height + depth * height);
    }

    public double getVolume() {
        return width * height * depth;
    }

    @Override
    public String toString() {
        return "Cuboid{" +
                "width=" + width +
                ", height=" + height +
                ", depth=" + depth +
                ", point=" + Arrays.toString(vertices) +
                super.getClass() + "";
    }
}

