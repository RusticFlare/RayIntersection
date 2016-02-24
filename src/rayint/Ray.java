package rayint;

public class Ray {
    public Vector p; // Point
    public Vector d; // Direction

    public Ray(Vector p, Vector d) {
        this.p = p;
        this.d = d;
    }

    public Vector point(double t) {
        return p.add(d.mult(t));
    }
}
