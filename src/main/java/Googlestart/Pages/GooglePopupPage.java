package Googlestart.Pages;

import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePopupPage {

    WebDriver driver;

    @FindBy(xpath = "//div/div/button[2]/div")
    WebElement acceptall;

    public GooglePopupPage(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver , this);
    }

    public void clickbutton()
    {
        acceptall.click();
    }
}
