package com.github.webdriverextensions.model;

import com.github.webdriverextensions.WebSite;
import com.github.webdriverextensions.model.components.Menu;
import com.github.webdriverextensions.model.pages.BotTestPage;
import com.github.webdriverextensions.model.pages.ExamplesPage;
import com.github.webdriverextensions.model.pages.HomePage;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WebDriverExtensionSite extends WebSite {

    public final String url = "file://" + getClass().getResource("/html/model-test.html").getPath();

    public HomePage homePage;
    public BotTestPage botTestPage;
    public ExamplesPage examplesPage;
    public WebDriverExtensionRepository webDriverExtensionRepository;
    @FindBy(how = How.CSS, using = ".btn-group")
    public Menu menu;

    @Override
    public void open(Object... arguments) {
        open(url);
    }

    @Override
    public void assertIsOpen(Object... arguments) throws AssertionError {
        examplesPage.assertIsOpen();
    }
}
