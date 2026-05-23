package abstraction;
/*
 *  methodlar body bolmaydi, lekin java 8+ defualt mehtod body mavjud
 * */

/*void addUser();


default boolean validateUser() {
    return true;
}*/
public interface TolovUsuli {
    boolean tolov(double summa);

    boolean validation();

}
