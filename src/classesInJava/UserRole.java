package classesInJava;

public enum UserRole {
    ADMIN,USER,TEACHER,MANAGER,BUGALTER;

    UserRole() {

    }


    public static UserRole getByNumber(int number) {
        UserRole[] roles = UserRole.values();
        if (number < 1 || number > roles.length) {
            throw new IllegalArgumentException("Bunday role mavjud emas");
        }
        return roles[number - 1];
    }

}
