package pagehelpers.useraccount;

import elements.Button;
import pageobjects.useraccount.MyAccountPageElements;

import java.util.HashMap;
import java.util.Map;

public class MyAccountPage {
    MyAccountPageElements myAccountPageElements;
    Map<MyAccountOptionTabs, Button> accountOptionTabsToElement;

    public MyAccountPage() {
        this.myAccountPageElements = new MyAccountPageElements();
        setOptionsMapValues();
    }


    public PersonalInformationPage openPersonalInformationPage() {
        myAccountPageElements.myPersonalInformation.click();
        return new PersonalInformationPage();
    }


    private void setOptionsMapValues() {
        this.accountOptionTabsToElement = new HashMap<>();
        accountOptionTabsToElement.put(MyAccountOptionTabs.ORDER_HISTORY, myAccountPageElements.orderHistoryAndDetails);
        accountOptionTabsToElement.put(MyAccountOptionTabs.CREDIT_SLIPS, myAccountPageElements.myCreditSlips);
        accountOptionTabsToElement.put(MyAccountOptionTabs.ADDRESSES, myAccountPageElements.myAddresses);
        accountOptionTabsToElement.put(MyAccountOptionTabs.PERSONAL_INFO, myAccountPageElements.myPersonalInformation);
        accountOptionTabsToElement.put(MyAccountOptionTabs.WISHLIST, myAccountPageElements.myWishList);

    }

    public enum MyAccountOptionTabs {
        ORDER_HISTORY, CREDIT_SLIPS, ADDRESSES, PERSONAL_INFO, WISHLIST
    }
}
