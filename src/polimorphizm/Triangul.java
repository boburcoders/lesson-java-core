package polimorphizm;

public class Triangul extends Shakl {
    protected double median;
    private double a;
    private double b;
    private double c;

    public Triangul(String rang, double median, double a, double b, double c) {
        super(rang);
        this.median = median;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        return a * b * c;
    }
}
