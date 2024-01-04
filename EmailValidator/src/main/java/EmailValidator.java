import java.util.Scanner;

public class EmailValidator {

    public boolean isValidEmail(String email) {
        return email != null && email.matches("[a-zA-Z0-9_%+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z]{3}");
    }

    public boolean isCorporateEmail(String email) {
        return email != null && email.endsWith("company.com");
    }
}
