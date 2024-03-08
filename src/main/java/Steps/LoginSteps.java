package Steps;

import Page_objects.LoginPage;
import Page_objects.LogoutPage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginSteps {
    WebDriver driver;
    LoginPage page;
    LogoutPage logoutPage;
    WebDriverWait wait;

    @Dado("que o usuario esteja na tela de login")
    public void telaLogin() {
        if (driver == null) {
            driver = new ChromeDriver();
            page = new LoginPage(driver);
            logoutPage = new LogoutPage(driver);
            wait = new WebDriverWait(driver, Duration.ofSeconds(6));
            driver.get("https://www.saucedemo.com/");
        }
    }

    @E("que o usuario preencha o campo de usuario com {string}")
    public void preencherUsuario(String usuario) {
        page.campoUsuario.sendKeys(usuario);
    }

    @E("que o usuario preencha o campo de senha com {string}")
    public void preencherSenha(String senha) {
        page.campoSenha.sendKeys(senha);
    }

    @Quando("ele clicar no botao de login")
    public void clicarLogin() {
        page.botaoLogin.click();
    }

    @Então("o sistema faz o login")
    public void loginTeste() throws Exception {
        logoutPage.botaoMenu.click();
    }

    @E("o sistema faz logout")
    public void logOut() {
        WebElement logout = logoutPage.getBotaoLogOut(wait);
        logout.click();
    }
}
