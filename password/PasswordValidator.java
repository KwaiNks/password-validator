package password;
public class PasswordValidator {
    
    String password;

    public String passwordValidator(String password){
        String passwordValidator = " ";
        if (password.matches(".{1,7}$")) {
            passwordValidator = "weakPassword";
        }else if ((password.matches("(?=.*[A-Z]).{8,14}$"))) {
            passwordValidator = "mediumPassword";
        }else if (password.matches("(?=.*\\W+)(?=.*[A-Z]).{15,}")) {
            passwordValidator = "StrongPassword";
        }
        return passwordValidator;
    }
}
