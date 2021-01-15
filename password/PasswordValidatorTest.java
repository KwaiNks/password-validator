package password;

import org.junit.Test;

public class PasswordValidatorTest {
    
    String password = " ";
    String passwordValidator;

    @Test
    public void shouldReturnWeakIfLessThanEight(){
        password = "Today";
        if (password.matches(".{1,7}$")) {
            passwordValidator = "weakPassword";
        }
        assertEquals("weakPassword", passwordValidator);
    }

    @Test
    public void shouldReturnMediumIfGreaterOrEqualToEightButLessThanFifteenAndContainsStringAndInt(){
       password = "Richmond@Today2021";
        if ((password.matches("(?=.*[A-Z]).{8,14}$"))) {
            passwordValidator = "mediumPassword";
        }
        assertEquals("mediumPassword", passwordValidator);
    }

    @Test
    public void shouldReturnStrongIfGreaterThanOrEqualsFifteen(){
        password = "@TomorrowJan2021!";
        if (password.matches("(?=.*\\W+)(?=.*[A-Z]).{15,}")) {
            passwordValidator = "StrongPassword";
        }
        assertEquals("StrongPassword", passwordValidator);
    }

}