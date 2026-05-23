package arrays;

public class Users {
    String name;
    String password;
    int age;
    String email;
    Gender gender;


    public Users(String password, String email) {
        this.password = password;
        this.email = email;
    }

    public Users(String name, String password, int age, String email) {
        this.name = name;
        this.password = password;
        this.age = age;
        this.email = email;
    }

    public void sum(int nomer) {
        //eskiz uz sendSms(nomer)
        System.out.println(nomer * nomer);
    }

    public String userCredentials() {
        return String.format("password: %s, email: %s ", password, email);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (!email.endsWith(".com")) {
            System.out.println("email kiritishda xato");
        } else
            this.email = email;
    }

    public boolean getGender() {
        switch (gender) {
            case MALE -> {
                System.out.println("Erkak");
                return true;
            }
            case FEMALE -> {
                System.out.println("Ayol");
                return true;
            }
        }

        return false;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public enum Gender {
        MALE,
        FEMALE
    }
}
