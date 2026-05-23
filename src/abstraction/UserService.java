package abstraction;

public interface UserService {

    UserService addUser(String userCreateRequest);

    String get(int id);

    boolean deleteUser(int id);

}
