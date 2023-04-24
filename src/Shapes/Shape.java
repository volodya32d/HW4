package Shapes;

import Vertices.Vertex;

import java.util.Arrays;
import java.util.List;

public class Shape {

    Vertex[] vertices;

    Shape(Vertex... vertices) {
        this.vertices = vertices.clone();
    }

    public <T> Shape(List<T> singletonList) {
    }

    public String toString() {
        return Arrays.toString(vertices);
    }


}

