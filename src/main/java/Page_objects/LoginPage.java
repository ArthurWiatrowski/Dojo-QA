package Page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }
    @FindBy(how = How.NAME, using = "user-name")
    public WebElement campoUsuario;

    @FindBy(how = How.NAME, using = "password")
    public WebElement campoSenha;

    @FindBy(how = How.ID, using = "login-buton")
    public WebElement botaoLogin;
}
