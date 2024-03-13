package Steps;
import Page_objects.CompraPage;
import Page_objects.LoginPage;
import io.cucumber.java.af.En;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import net.bytebuddy.implementation.bytecode.Throw;

import static Steps.Hook.*;

public class CompraSteps {
    LoginPage page;
    CompraPage compraPage;
    @E("que o usuario preencha o campo de usuario com dados validos")
    public void preencherUsuario(){
        compraPage = new CompraPage(driver);
        page = new LoginPage(driver);
        page.campoUsuario.sendKeys("standard_user");
    }
    @E("que o usuario preencha o campo de senha com dados validos")
    public void preencherSenha(){
        page.campoSenha.sendKeys("secret_sauce");
    }

    @Dado("que o usuario esteja na tela de compra")
    public void verificaTela() throws Exception {
        if(!driver.getCurrentUrl().equals("https://www.saucedemo.com/checkout-step-two.html")){
            throw new Exception("tela errada");
        }
    }

    @E("o usuario adiciona itens no carrinho")
    public void adicionaCarrinho(){
        compraPage.botaoAddMochila.click();
        compraPage.botaoAddLanterna.click();
    }

    @E("que ele clique no botao do carrinho")
    public void entraCarrinho(){
        compraPage.botaoCarrinho.click();
    }

    @E("que ele clique no botao do checkout")
    public void checkout(){
        compraPage.botaoCheckout.click();
    }

    @E("que ele preencha os dados corretamente e aperte no botao contiue")
    public void preencheDados(){
        compraPage.campoNome.sendKeys("Arthur");
        compraPage.campoSobrenome.sendKeys("Wiatrowski");
        compraPage.campoZipCode.sendKeys("1234");
        compraPage.botaoContinue.click();
    }

    @Quando("ele clicar no botao de finalizar")
    public void finaliza(){
        compraPage.botaoFinish.click();
    }

    @Entao("o sistema finaliza a compra e volta para a pagina inicial")
    public void telaInicial(){
        compraPage.botaoHome.click();
    }


}
