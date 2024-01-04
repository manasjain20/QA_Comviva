import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EmailValidatorTest {

    private EmailValidator validator = new EmailValidator();

    @Test
    void isValidEmail_ValidEmail_ReturnsTrue() {
        assertTrue(validator.isValidEmail("user@example.com"));
    }

    @Test
    void isValidEmail_InvalidEmail_ReturnsFalse() {
        assertFalse(validator.isValidEmail("invalid_email"));
    }

    @Test
    void isValidEmail_NullInput_ReturnsFalse() {
        assertFalse(validator.isValidEmail(null));
    }

    @Test
    void isCorporateEmail_CorporateEmail_ReturnsTrue() {
        assertTrue(validator.isCorporateEmail("employee@company.com"));
    }

    @Test
    void isCorporateEmail_NonCorporateEmail_ReturnsFalse() {
        assertFalse(validator.isCorporateEmail("user@example.com"));
    }

    @Test
    void isCorporateEmail_NullInput_ReturnsFalse() {
        assertFalse(validator.isCorporateEmail(null));
    }
}