package basicTests;

import dataModels.user.User;
import dataModels.user.UserRepository;
import org.testng.annotations.Test;
import pageHelpers.MainPageHelper;

import static com.codeborne.selenide.Selenide.sleep;


public class RegistrationTests extends BaseTest {

    @Test
    public void openRegistrationForm() {
        User user = new UserRepository().getUser();
        new MainPageHelper()
                .goToSignInPage()
                .proceedToRegistrationFormWithEmail(user.getLoginCredentials().getEmail())
                .fillForm(user);
        sleep(10000);
    }
}
