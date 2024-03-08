package Page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogoutPage {
    public LogoutPage(WebDriver driver) {PageFactory.initElements(driver, this);}

    @FindBy(how = How.ID, using = "react-burger-menu-btn")
    public WebElement botaoMenu;

    @FindBy(how = How.ID, using = "logout_sidebar_link")
    public WebElement botaoLogOut;

    public WebElement getBotaoLogOut(WebDriverWait wait){
        WebElement elemento = wait.until(ExpectedConditions.elementToBeClickable(By.id("logout_sidebar_link")));
        return elemento;
    }
}
