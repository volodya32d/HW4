package Vertices;

public class Vertex2 {
    double x;
    double y;
    double z;

    public Vertex2(double x, double y, double z) {
        super();
        this.z = z;

    }

    public Vertex2(int x, int y) {
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Vertices2{" + "x=" + x + ", y=" + y + ", z=" + z + '}';
    }
}