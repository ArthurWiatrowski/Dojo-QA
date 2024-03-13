package Page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CompraPage {
    public CompraPage(WebDriver driver) {PageFactory.initElements(driver, this);}

    @FindBy(how = How.ID, using = "add-to-cart-sauce-labs-backpack")
    public WebElement botaoAddMochila;

    @FindBy(how = How.ID, using = "add-to-cart-sauce-labs-bike-light")
    public WebElement botaoAddLanterna;
    @FindBy(how = How.XPATH, using = "//*[@id=\"shopping_cart_container\"]/a")
    public WebElement botaoCarrinho;

    @FindBy(how = How.ID, using = "checkout")
    public WebElement botaoCheckout;

    @FindBy(how = How.ID, using = "first-name")
    public WebElement campoNome;

    @FindBy(how = How.ID, using = "last-name")
    public WebElement campoSobrenome;

    @FindBy(how = How.ID, using = "postal-code")
    public WebElement campoZipCode;

    @FindBy(how = How.ID, using = "continue")
    public WebElement botaoContinue;

    @FindBy(how = How.ID, using = "finish")
    public WebElement botaoFinish;

    @FindBy(how = How.ID, using = "back-to-products")
    public WebElement botaoHome;
}
