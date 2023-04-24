package Shapes;

import Vertices.Vertex;

public class Rectangle extends PlaneShape {

    private double width;
    private double height;

    public Rectangle(Vertex startingPoint, double width, double height) {
        super();
        this.width = width;
        this.height = height;

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


    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * width * height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", point=" + super.toString() +
                super.getAreaAndPerimeter() +
                '}';
    }
}

