package pageHelpers;

import pageObjects.MainPageElements;

public class MainPageHelper {
    private final MainPageElements mainPageElements;

    public MainPageHelper() {
        this.mainPageElements = new MainPageElements();
    }

    public SignInPageHelper goToSignInPage() {
        mainPageElements.signInButton.click();
        return new SignInPageHelper();
    }
}
