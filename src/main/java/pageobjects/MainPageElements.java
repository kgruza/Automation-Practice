package pageobjects;

import elements.Button;

import static com.codeborne.selenide.Selenide.$;

public class MainPageElements {
   public Button signInButton = new Button($(".login"));


}
