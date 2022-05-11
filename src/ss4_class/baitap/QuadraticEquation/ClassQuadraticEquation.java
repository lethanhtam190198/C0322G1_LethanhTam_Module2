package ss4_class.baitap.QuadraticEquation;

public class ClassQuadraticEquation {
    double a, b, c;

    public ClassQuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        return b * b - (4 * a * c);
    }

    public double getRoot1() {
        if (this.getDiscriminant() < 0) return 0;
        return ((-b + Math.sqrt(this.getDiscriminant())) / (2 * a));
    }

    public double getRoot2() {
        if (this.getDiscriminant() < 0) return 0;
        return ((-b - Math.sqrt(this.getDiscriminant())) / (2 * a));
    }
}

