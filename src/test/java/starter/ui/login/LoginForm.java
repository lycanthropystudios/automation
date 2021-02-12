package starter.ui.login;

import org.openqa.selenium.By;


public class LoginForm {
    public static By USERNAME_FIELD = By.name("email");
    public static By PASSWORD_FIELD = By.name("password");
    public static By LOGIN_BUTTON = By.xpath(".//span[contains(text(), 'Login')]");
    public static By REMEMBER_ME = By.className("iCheck-helper");
}
