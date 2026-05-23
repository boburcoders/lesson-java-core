package abstraction;

public class ExcelService implements UserService {
    @Override
    public UserService addUser(String userCreateRequest) {
        System.out.print("row create on excel");
        return null;
    }

    @Override
    public String get(int id) {
        return "get from excel";
    }

    @Override
    public boolean deleteUser(int id) {
        return id < 100;
    }
}
