package password;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PasswordValidatorTest {

    private PasswordValidator passwordValidator = new PasswordValidator();
    @Test
    public void shouldReturnWeakIfLessThanEight(){
        String password = "Today";
        assertEquals("weakPassword", passwordValidator.passwordValidator(password));
    }

    @Test
    public void shouldReturnMediumIfGreaterOrEqualToEightButLessThanFifteenAndContainsStringAndInt(){
       String password = "Richmond@21";
        assertEquals("mediumPassword", passwordValidator.passwordValidator(password));
    }

    @Test
    public void shouldReturnStrongIfGreaterThanOrEqualsFifteen(){
        String password = "@TomorrowJan2021!";
        assertEquals("StrongPassword", passwordValidator.passwordValidator(password));
    }

}
