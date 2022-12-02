    package base_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SlavaSearchPage extends BasePage {
    public SlavaSearchPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "/html/body/div[1]/div[1]/div/div[9]/p[6]/a")
    private WebElement catalogButton;
    @FindBy(xpath = "/html/body/div[1]/div[1]/div/div[6]/div[2]")
    private WebElement searchIcon;
    @FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/div/div/div/div/div[1]/div/div/div[1]/a")
    private WebElement womanJacket;
    @FindBy(xpath = "/html/body/div[1]/div[3]/div[3]/div[2]/div[6]/div[1]/div/div[2]/div[1]/a")
    private WebElement hrefExample;
    @FindBy(xpath = "/html/body/div[1]/div[3]/div[3]/div[2]/div[4]/div[1]/div/div[3]/form/table/tbody/tr[5]/td[2]/div/div[23]/input")
    private WebElement getCheckboxBlack;
    @FindBy(xpath = "/html/body/div[1]/div[3]/div[3]/div[2]/div[4]/div[1]/div/div[3]/form/table/tbody/tr[6]/td[2]/input[1]")
    private WebElement applyButton;
    @FindBy(xpath = "/html/body/div[1]/div[3]/div[3]/div[2]/div[6]")
    private List<WebElement> result;
    @FindBy(xpath = "/html/body/div[7]/div[3]/div[2]/form/p/input")
    private WebElement searchButton;
    @FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/div[2]/div[9]/div[1]/label[1]/input")
    private WebElement radioButton;
    @FindBy(xpath = "/html/body/div[7]/div[3]/div[2]/form/div[1]/input")
    private WebElement searchField;
    @FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/div[4]/div[3]/div/div[2]/div[1]/div/form/table/tbody/tr[2]/td[2]/input")
    private WebElement emailField;
    @FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/div[2]/div[2]/div[2]/div")
    private WebElement basketButton;

    public SlavaSearchPage clickCatalogButton() {
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS).until(
                        ExpectedConditions.elementToBeClickable(catalogButton))
                .click();
        return this;
    }
    public SlavaSearchPage clickWomanJacket() {
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS).until(
                        ExpectedConditions.elementToBeClickable(womanJacket))
                .click();
        return this;
    }
    public SlavaSearchPage clickRadioButton() {
        radioButton.click();
        return this;
    }

    public SlavaSearchPage searchFieldInput(String text) {
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS).until(
                        ExpectedConditions.elementToBeClickable(searchField))
                .sendKeys(text);
        return this;
    }
    public SlavaSearchPage clickSearchButton(){
        searchButton.click();
        return this;
    }
    public SlavaSearchPage clickBasketButton() {
        basketButton.click();
        return this;
    }

    public SlavaSearchPage clickSearchIcon() {
        searchIcon.click();
        return this;
    }

    public SlavaSearchPage clickCheckboxBlack() {
        getCheckboxBlack.click();
        return this;
    }

    public SlavaSearchPage clickHrefExample() {
        hrefExample.click();
        return this;
    }

    public SlavaSearchPage clickApplyButton() {
        applyButton.click();
        return this;
    }
}