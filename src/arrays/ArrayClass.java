package arrays;

public class ArrayClass {
    /*public static String check(int a) {
        return a % 2 == 0 ? "Juft" : "Toq";
    }

    int[] ages = new int[12];*/

    public static void main(String[] args) {

        String[] staff = new String[10];
        int[] array = {1, 2, 3, 4, 5, 6, 9};
//        System.out.println(Arrays.toString(staff));
//        System.out.println(arrays.ArrayClass.check(12));

            /*
            fori,
             for each,
              while
              ,do-while
            * */

//        int[] array = new int[12];
        /*for (int i : array) {

        }
        for (int i = 0; i <10; i++) {

        }*/
       /* Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int positive = 0, juft = 0;

        while (i >= 0) {
            if (i > 0) positive++;
            if (i % 2 == 0) juft++;
            i--;
        }*/
//        System.out.println(positive);
//        System.out.println(juft);

        /*do {
            System.out.println("Hello");
        } while (false);*/

        /*int[] nums = {12, 3, 4, 5, -12, 4};
        int p = 0, n = 0;

        for (int value : nums) {
            if (value > 0) p++;
            else if (value < 0) n++;

        }
        System.out.println(p);
        System.out.println(n);*/

        String[] str = {"Azamat", "Olim", "Hello"};
        for (String value : str) {
            System.out.println(value);
        }


    }
}
