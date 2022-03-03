package basicTests;

import org.testng.annotations.Test;
import pageActions.MainPageActions;

import static com.codeborne.selenide.Selenide.sleep;


public class RegistrationTests extends BaseTest {

    @Test
    public void openRegistrationForm() {
        new MainPageActions()
                .goToSignInPage()
                .proceedToRegistrationFormWithEmail("fakeemail@fakefake.com");
        sleep(10000);
    }
}
