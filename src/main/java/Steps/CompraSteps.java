package Steps;

import Page_objects.CompraPage;
import Page_objects.LoginPage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

import static Steps.Hook.driver;

public class CompraSteps {
    CompraPage compraPage;
    @Dado("que o usuario esteja na tela de compra")
    public void verificaTela() throws Exception {
        if(!driver.getCurrentUrl().equals("https://www.saucedemo.com/checkout-step-two.html")){
            throw new Exception("tela errada");
        }
    }

    @E("que ele faça o fluxo de compra")
    public void fluxoCompra(){
        compraPage.botaoAddMochila.click();
        compraPage.botaoAddLanterna.click();

        compraPage.botaoCarrinho.click();

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
