package Shapes;

import Interface.AreaMeasurable;
import Interface.PerimeterMeasurable;
import Vertices.Vertex;

import java.util.List;

public class PlaneShape extends Shape implements PerimeterMeasurable, AreaMeasurable {
    protected <Vertex2> PlaneShape(Vertex2 vertices, Vertex b, Vertex c) {
        super();
    }

    public <T> PlaneShape(List<T> singletonList) {
        super(singletonList);
    }

    public PlaneShape() {
        super();
    }

    public String getAreaAndPerimeter() {
        return " Area = " + getArea() + ", Volume = " + getPerimeter();
    }

    public double getArea() {
        return 0;
    }

    public double getPerimeter() {
        return 0;
    }
}
