package exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        try {
            System.out.println(Test.readFile("/home/bobur/IdeaProjects/PortfolioProjects/core_java/src/exceptions/test.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static String readFile(String path) throws IOException {
//        "/home/bobur/IdeaProjects/PortfolioProjects/core_java/src/exceptions/test.txt"
        BufferedReader br = new BufferedReader(new FileReader(path));
        String x = br.readLine();
        br.close();
        System.out.println(x);
        return x;

    }

    public String getUserName(int userId) {
        //User user = db.getUserNameById(userdId);
//        if (user == null) {
//            throw new NotFoundException("User not found with id: " + userId, 404);
//        }
        return null;
    }
}
