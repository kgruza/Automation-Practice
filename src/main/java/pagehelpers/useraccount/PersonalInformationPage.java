package pagehelpers.useraccount;

import com.google.common.base.Strings;
import data.models.user.User;
import data.models.user.enums.Gender;
import pageobjects.useraccount.PersonalInformationElements;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class PersonalInformationPage {
    PersonalInformationElements personalInformationElements;

    public PersonalInformationPage() {
        this.personalInformationElements = new PersonalInformationElements();
    }

    public PersonalInformationPage verifyPersonalInformation(User user) {
        verifyGender(user.getGender());

        if (!Strings.isNullOrEmpty(user.getFirstName()))
            assertEquals(personalInformationElements.firstName.getText(), user.getFirstName());
        if (!Strings.isNullOrEmpty(user.getLastName()))
            assertEquals(personalInformationElements.lastName.getText(), user.getLastName());
        if (!Strings.isNullOrEmpty(user.getLoginCredentials().getEmail()))
            assertEquals(personalInformationElements.emailAddress.getText(), user.getLoginCredentials().getEmail());

        assertEquals(personalInformationElements.signUpForNewsletter.isSelected()
                , user.getRegistrationOptions().isSignUpForNewsletter());
        assertEquals(personalInformationElements.receiveSpecialOffers.isSelected()
                , user.getRegistrationOptions().isReceiveSpecialOffer());
        return this;
    }

    private void verifyGender(Gender gender) {
        switch (gender) {
            case MR:
                assertTrue(personalInformationElements.mrRadio.isSelected());
                break;
            case MRS:
                assertTrue(personalInformationElements.mrsRadio.isSelected());
                break;
        }
    }
}
