package rayint;

public class ConvexPolyhedron {
    public ConvexPolygon[] sides;

    public ConvexPolyhedron(ConvexPolygon[] sides) {
        this.sides = sides;
    }

    public boolean intersects(Ray r) {
        for (ConvexPolygon side : sides) {
            // If the point is on one of the triangles then it is on the polygon
            if (side.intersects(r)) {
                return true;
            }
        }
        return false;
    }
}
