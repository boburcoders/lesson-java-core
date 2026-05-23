package abstraction;

public class PostgresService implements UserService {
    @Override
    public UserService addUser(String userCreateRequest) {
        System.out.println("saved to postgresql" + userCreateRequest);
        return null;
    }

    @Override
    public String get(int id) {
        return "user get request from psql";
    }

    @Override
    public boolean deleteUser(int id) {
        return id >= 1;
    }
}
