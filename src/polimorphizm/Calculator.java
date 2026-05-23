package polimorphizm;

public class Calculator {

    /*
    Polimorfizm bu kop xilllik
    ovozChiqar()
    mashina ->
    mushuk-> miy
    it->
    SOLID
    compile time polimorfiz, -> method overloding,
    runtime time polimorfizm -> method overriding

    method overloading -> hisoblash() -> meneger oyligi 25, parametr, sum(int a, int b), sum(long a, long b, double c), sum(int b, int a)
     qoidalari: metod nomi ozgarmaydi,
      parametrlar soni, yoki ketma ketligi ozgaradi,
       parametrlar ozgarmay turib  faqat retrun typni ozgartib bolmaydi

       .java
       .class, bytcode
       JVM -> Java Virtual Machine, bytecode -> machine code

       Method overriding

       method nomi bir xil bolishi shart
       return type ham bir xil shart
       @Override majburiy emas lekin yozmasa katta kamchilik
       private, static, override
       final method override bolmaydi
       public, protected, defult, prive
        protect, public

        upcasting, downcasting





     * */
    public static void main(String[] args) {

    }

    public int sum(int a, int b) {
        return a + b;
    }


    public double sum(int a, int b, double c) {
        return a + b;
    }

    protected double sum(int[] array) {
        int result = 0;
        for (int i : array) {
            result += i;
        }
        return result;
    }


}
