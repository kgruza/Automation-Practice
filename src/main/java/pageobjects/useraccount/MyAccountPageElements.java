package pageobjects.useraccount;

import elements.Button;

import static com.codeborne.selenide.Selenide.$x;

public class MyAccountPageElements {
    public Button orderHistoryAndDetails = new Button($x("//a[@title='Orders']"));
    public Button myCreditSlips = new Button($x("//a[@title='Credit slips']"));
    public Button myAddresses = new Button($x("//a[@title='Addresses']"));
    public Button myPersonalInformation = new Button($x("//a[@title='Information']"));
    public Button myWishList = new Button($x("//a[@title='My wishlists']"));
    public Button backHomeButton = new Button($x("//a[@title='Home']"));


}
