package rayint;

public class Vector {
    public double x;
    public double y;
    public double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector add(Vector v) {
        return new Vector(x + v.x, y + v.y, z + v.z);
    }

    public Vector subtract(Vector v) {
        return new Vector(x - v.x, y - v.y, z - v.z);
    }

    public double dotProd(Vector v) {
        return (x * v.x) + (y * v.y) + (z * v.z);
    }

    public Vector crossProd(Vector v) {
        return new Vector((y * v.z) - (z * v.y), (x * v.z) - (z * v.x), (x * v.y) - (y * v.z));
    }

    public Vector mult(double d) {
        return new Vector(x * d, y * d, z * d);
    }
}
