package rayint;

public class Triangle {
    public Vector v0;
    public Vector v1;
    public Vector v2;
    public Vector u;
    public Vector v;
    public Vector n;
    public Plane plane;

    public Triangle(Vector v0, Vector v1, Vector v2) {
        this.v0 = v0;
        this.v1 = v1;
        this.v2 = v2;
        this.u = v1.subtract(v0); // Vector from v0 to v1
        this.v = v2.subtract(v0); // Vector from v0 to v2
        this.n = u.crossProd(v); // Normal of triangle
        this.plane = new Plane(v0, n); // Plane triangle lies on
    }

    public boolean intersects(Ray r) {
        try {
            Vector p = plane.intersectPoint(r); // Get intersection point with the plane
            Vector w = p.subtract(v0); // Vector from v0 to p
            // s and t are the scalar values of u and v which describe the triangle
            double s = ((u.dotProd(v) * w.dotProd(v)) - (v.dotProd(v) * w.dotProd(u))) / ((u.dotProd(v) * u.dotProd(v)) - (u.dotProd(u) * v.dotProd(v)));
            double t = ((u.dotProd(v) * w.dotProd(u)) - (u.dotProd(u) * w.dotProd(v))) / ((u.dotProd(v) * u.dotProd(v)) - (u.dotProd(u) * v.dotProd(v)));
            return (t >= 0) && (s >= 0) && (s+t <= 1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
