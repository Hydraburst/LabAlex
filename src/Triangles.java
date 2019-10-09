import java.util.ArrayList;


public class Triangles {
    Triangle[] triangles = new Triangle[0];

    public Triangles(Triangle[] triangles) {
        this.triangles = triangles;
    }

    public Triangle[] getTriangles() {
        return triangles;
    }

    public void setTriangles(Triangle[] triangles) {
        this.triangles = triangles;
    }

    static public double getMaxSquare(Triangle[] triangles) {
        double max = triangles[0].getSquare();
        for (Triangle i : triangles) {
            if (i.getSquare() > max) {
                max = i.getSquare();
            }
        }
        return max;

    }
}

