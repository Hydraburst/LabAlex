public class RightTriangles {
    WriteTriangle [] rightTriangles = new WriteTriangle[0];

    public RightTriangles(WriteTriangle[] rightTriangles) {
        this.rightTriangles = rightTriangles;
    }

    public WriteTriangle[] getRightTriangles() {
        return rightTriangles;
    }

    public void setRightTriangles(WriteTriangle[] rightTriangles) {
        this.rightTriangles = rightTriangles;
    }
    static public double getMinC(WriteTriangle[] writeTriangles) {
        double min = writeTriangles[0].getC();
        for (Triangle i : writeTriangles) {
            if (i.getC() < min) {
                min = i.getC();

            }
        }
        return min;
    }
}
