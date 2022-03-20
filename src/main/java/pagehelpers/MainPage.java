package pagehelpers;

import pageobjects.MainPageElements;

public class MainPage {
    private final MainPageElements mainPageElements;

    public MainPage() {
        this.mainPageElements = new MainPageElements();
    }

    public SignInPage goToSignInPage() {
        mainPageElements.signInButton.click();
        return new SignInPage();
    }
}
