package rayint;

public class ConvexPolygon {
    public Triangle[] triangles; // The triangles that make up the convex polygon

    public ConvexPolygon(Vector[] points) throws Exception {
        if (points.length < 3) {
            throw new Exception("Must have more than 2 points.");
        }
        triangles = new Triangle[points.length - 2];
        for (int i = 0; i < points.length - 2; i++) {
            triangles[i] = new Triangle(points[i], points[i+1], points[i+2]);
        }
    }

    public boolean intersects(Ray r) {
        for (Triangle triangle : triangles) {
            // If the point is on one of the triangles then it is on the polygon
            if (triangle.intersects(r)) {
                return true;
            }
        }
        return false;
    }
}
