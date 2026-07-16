package Exceptions.multicatch;

import java.io.IOException;
import java.sql.SQLException;

public class UserServiceWithoutMulticatch {

    public void registerUser() {
        try {
            readEmailTemplate();
            saveUser();
            System.out.println("User Registered");

        } catch (IOException e) {

            System.out.println("Registration Failed");
            e.printStackTrace();

        } catch (SQLException e) {

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
