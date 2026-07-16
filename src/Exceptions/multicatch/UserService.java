package Exceptions.multicatch;

import java.io.IOException;
import java.sql.SQLException;

public class UserService {

    public void registerUser() {

        try {
            readEmailTemplate();
            saveUser();
            System.out.println("User Registered");

        } catch (IOException | SQLException e) {
            System.out.println("Registration Failed");
            e.printStackTrace();
        }
    }

    private void readEmailTemplate() throws IOException {
        throw new IOException("Email template missing");
    }

    private void saveUser() throws SQLException {
        // Database Logic
    }
}
