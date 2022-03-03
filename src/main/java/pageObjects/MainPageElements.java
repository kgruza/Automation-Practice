package pageObjects;

import elementsImplementation.Button;

import static com.codeborne.selenide.Selenide.$;

public class MainPageElements {
    private Button signInButton;

    public Button getSignInButton() {
        signInButton = new Button($(".login"));
        return signInButton;
    }


}
