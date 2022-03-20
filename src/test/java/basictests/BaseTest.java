package basictests;


import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    @BeforeSuite
    void setupConfig() {
        SelenideLogger.addListener("AllureSelenide",
                new AllureSelenide()
                        .screenshots(true)

                        .savePageSource(false));
        Configuration.baseUrl = "http://automationpractice.com/index.php";


    }

    @BeforeTest
    void prepareTestEnv() {
        open(Configuration.baseUrl);
    }


}
