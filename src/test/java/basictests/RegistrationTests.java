package basictests;

import data.models.user.User;
import data.repositories.user.UserRepository;
import org.testng.annotations.Test;
import pagehelpers.MainPage;
import pagehelpers.useraccount.MyAccountPage;
import pagehelpers.useraccount.PersonalInformationPage;

import static com.codeborne.selenide.Selenide.sleep;


public class RegistrationTests extends BaseTest {

    @Test
    public void newUserRegistration() {
        User user = new UserRepository().getUser();
        new MainPage()
                .goToSignInPage()
                .proceedToRegistrationFormWithEmail(user.getLoginCredentials().getEmail())
                .fillFormAndSubmit(user)
                .openPersonalInformationPage()
                .verifyPersonalInformation(user);

        sleep(10000);
    }
}
