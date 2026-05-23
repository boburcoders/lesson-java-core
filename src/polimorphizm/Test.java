package polimorphizm;

public class Test {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(3, 4));

        System.out.println(calculator.sum(2, 3, 5.0));

        System.out.println(calculator.sum(new int[]{1, 2, 3, 4, 5}));

    }
}
