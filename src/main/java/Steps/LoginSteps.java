package Steps;

import Page_objects.LoginPage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {
    private WebDriver diver;
    private LoginPage page;
    @Dado("que o usuario esteja na tela de login")
    public void telaLogin(){
        WebDriver driver = new ChromeDriver();
        LoginPage page = new LoginPage(driver);

        driver.get("https://www.saucedemo.com/");
    }
    @E("que o usuario preencha o campo de usuario com {string}")
    public void preencherUsuario(String usuario){
        page.campoUsuario.sendKeys(usuario);
    }
    @E("que o usuario preencha o campo de senha com {string}")
    public void preencherSenha(String senha){
        page.campoSenha.sendKeys(senha);
    }
    @Quando("ele clicar no botao de login")
    public void clicarLogin(){
        page.botaoLogin.click();
    }
    
}
