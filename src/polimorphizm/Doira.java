package polimorphizm;

public class Doira extends Shakl {
    protected double radius;

    public Doira(String rang, double radius) {
        super(rang);
        this.radius = radius;
    }

    @Override
    public double area() {
        return 2 * 3.14 * (radius * radius);
    }
}
