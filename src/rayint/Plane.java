package rayint;

public class Plane {
    public Vector v0;
    public Vector n;

    public Plane(Vector v0, Vector n) {
        this.v0 = v0;
        this.n = n;
    }

    public Vector intersectPoint(Ray r) throws Exception {
        if (n.dotProd(r.d) == 0) {
            throw new Exception("Divide by 0");
        }
        return r.point(n.dotProd(v0.subtract(r.p)) / n.dotProd(r.d));
    }
}
