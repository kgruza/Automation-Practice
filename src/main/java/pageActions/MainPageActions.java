package pageActions;

import pageObjects.MainPageElements;

public class MainPageActions {
    private final MainPageElements mainPageElements;

    public MainPageActions() {
        this.mainPageElements = new MainPageElements();
    }

    public SignInPageActions goToSignInPage() {
        mainPageElements.getSignInButton().click();
        return new SignInPageActions();
    }
}
