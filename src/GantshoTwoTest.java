import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testValidatename() {
        assertTrue(Main.Validatename("user_"));
        assertFalse(Main.Validatename("username"));
        assertFalse(Main.Validatename("user_name"));
        assertFalse(Main.Validatename("us_er"));
    }

    @Test
    public void testValidatepassword() {
        assertTrue(Main.Validatepassword("Password1!"));
        assertFalse(Main.Validatepassword("password"));
        assertFalse(Main.Validatepassword("Password"));
        assertFalse(Main.Validatepassword("Password1"));
        assertFalse(Main.Validatepassword("password1!"));
    }


}
